package exception;

public class Try {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int i = 10;

			int k = 20;

			int l = i / 0;

			int j = k / i;

			System.out.println(j);

			System.out.println(l);
		} catch (Exception e) {

			System.out.println(e);
		}

		System.out.println("executed succesfully");
	}

}
