package pojopkg;

public  class pojo {
	
	private String message;
	private String  greet;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getGreet() {
		return greet;
	}
	public void setGreet(String greet) {
		this.greet = greet;
	}
	

}


/*
 * create java object
 * pojo m= nee pojo();
 * m.setMessage("hello");
 * 
 * given().body(m).
 * when().Post("/message");
 * 
 * 
 * 
 * 
 * 
 */

/*
 * 
 * {
 *   message: "hello"
 *   greet:"hi"
 *  }
 */

