package exception;

public class Throw {
	public static void main(String args[]) {
		
		try_display(new Person("Paneeth", 4, "Us"));
		try_display(new Person("theju", 7, "Indian"));

	}
	
	static void try_display(Person pn) {
		try {
			display(pn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void display(Person p) throws Exception {
		if (p.Nationality.equals("Indian")) {
			System.out.println(p.Name + " " + p.age + " " + p.Nationality + " ");
		} else {
			throw new NonIndianException();
		}
	}
}

class NonIndianException extends Exception {

}

class Person {
	String Name;
	int age;
	String Nationality;

	Person(String N, int A, String Nationality1) {
		Name = N;
		age = A;
		Nationality = Nationality1;
	}
}
