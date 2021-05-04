package exception;

public class multiExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a[] = new int[5];
				a[6]= 4;
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			int i = 10;
			
			int k = 20;
			
			int j = k / i;
			
			System.out.println(j);
			
			int l = i / 0;
			
			System.out.println(l);
		}
		catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		finally{
			System.out.println("rest of the code");
		}
		System.out.println("executed succesfully");
	}

}//if exception is handled total program is executed
