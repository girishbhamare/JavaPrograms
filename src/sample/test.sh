#!/bin/bash
#set -x
user=user2@zmc.com
password=test123
zimbraXZimletCompatibleWith=4.1.2
cacheBust=1611305925768
localdirpath=/root

value=""
while true
do
        rm  $localdirpath/cksum.md5
        touch $localdirpath/cksum.md5


zm_auth_token=$(grep -oPm1 "(?<=<authToken>)[^<]+" <<< "`kubectl  exec -it zmc-mailbox-0 -- bash -c '/opt/zimbra/bin/zmsoap -z -t account -m $user  AuthRequest/account="$user" @by="name" ../password="$password" -vv | grep authToken | tail -1'`")
#Get all available pods and download zimlet .zgz file from eaech pods && copy all zgz file into local directory.
kubectl get pods |grep zmc-mailbox |cut -f1 -d\  |\
        {       while read pod; \
                 do echo "$pod writing:";\
                           kubectl exec -t $pod -- bash -c \
                              "curl --location --request POST 'https://localhost:8443/service/zimlet/res/Zimlets-nodev_all.zgz?zimbraXZimletCompatibleWith=$zimbraXZimletCompatibleWith&cacheBust=$cacheBust' --header 'Content-Type: application/soap+xml' --header 'Content-Type: text/plain' --header 'Cookie: ZM_AUTH_TOKEN=$zm_auth_token' -k -o $pod.zgz"&>/dev/null;kubectl  cp  $pod:/opt/zimbra/$pod.zgz  $localdirpath/$pod.zgz;

#get hash value of each zgz file and store into file.
echo `md5sum $pod.zgz` >> "$localdirpath/cksum.md5"
done
}
#Get hash values from file
zimlet_hash_array=( $(awk '{ print $1 }' $localdirpath/cksum.md5) )
zimlet_hash_array_mailbox=( $(awk '{ print $2 }' $localdirpath/cksum.md5) )

#check for uniq value and if found different then print hash value and respective mailbox pod
for (( i=0; i<${#zimlet_hash_array[@]}; i++ ));
do
        if [ $i == 0 ] && [ -z ${value} ]; then
                value=${zimlet_hash_array[0]}
                echo "Comparing with $value ${zimlet_hash_array_mailbox[0]}"
        else
                if [ ${zimlet_hash_array[$i]} != $value ]; then
                echo "--------------Found different value in:--------------------------"
                echo "${zimlet_hash_array[$i]} ${zimlet_hash_array_mailbox[$i]}"
                #break 2
                exit
        fi
        echo " ******************All pods are in sync*************************"
        fi
done
echo "size" ${#zimlet_hash_array[@]}
sleep 10
done
