package java_exercise;
//constructor with getter setter

public class exercise2 {
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static void main(String[] args) {
		exercise2 ex = new exercise2();
		ex.setMessage("dog is lovely");
		System.out.println(ex.getMessage());
	}
	

}
