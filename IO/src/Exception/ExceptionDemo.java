package Exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {

		try {
			function();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			function();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			function();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
	}
	public static void function() throws Exception{
		throw new Exception("異常");
	}
}
