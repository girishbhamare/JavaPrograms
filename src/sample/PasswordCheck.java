package sample;

public class PasswordCheck {

	/*
	 * At least 8 characher 1 cap 1 small 1 number
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "Password1";

		System.out.println(valPassword(password));

	}

	public static boolean valPassword(String password) {

		if (password.length() > 7) {

			if (checkPass(password)) {

				System.out.println("Password is Valid");
				return true;

			} else {
				return false;
			}

		} else {
			System.out.println("Password is too short");
			return false;

		}

	}

	public static boolean checkPass(String password) {

		boolean hasNum = false;
		boolean hasCap = false;
		boolean haslow = false;
		boolean hasSpace = false;
		Character c;

		for (int i = 0; i < password.length(); i++) {

			c = password.charAt(i);

			if (Character.isDigit(c)) {

				hasNum = true;
			} else if (Character.isUpperCase(c)) {

				hasCap = true;
			} else if (Character.isLowerCase(c)) {

				haslow = true;

			} else if (Character.isWhitespace(c)) {

				hasSpace = true;

			}

			if (hasNum && hasCap && haslow && !hasSpace) {

				return true;
			}

		}

		return false;

	}

}
