package exception;

public class JavaTpointEXamples {
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}

	public static void main(String args[]) {
		JavaTpointEXamples p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}

class TestExceptionChild4 extends JavaTpointEXamples {
	void msg() {
		System.out.println("child");
	}

}