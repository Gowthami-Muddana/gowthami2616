package exception;

public class Finallyexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 10;
			
			int k = 20;
			
			int j = k / i;
			
			System.out.println(j);
			
			
		}
		finally  {
			
			System.out.println("rest of the code");
		}
		
		System.out.println("executed succesfully");
	}

}
