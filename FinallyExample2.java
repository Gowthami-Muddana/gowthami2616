package exception;

public class FinallyExample2 {
	public static void main(String[] args) {
		try {
			try {
				int a[] = new int[5];
				a[6] = 4;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				int i = 10;

				int k = 20;

				int j = k / i;

				System.out.println(j);

				int l = i / 0;

				System.out.println(l);
			} catch (NullPointerException e) {// exception not handled .exception is occured in last.rest of the program is executed

				System.out.println(e);
			}
		} finally {
			System.out.println("rest of the code");
		}
		System.out.println("executed succesfully");
	}
}
