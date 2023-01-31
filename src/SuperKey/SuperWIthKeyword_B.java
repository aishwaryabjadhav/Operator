package SuperKey;

public class SuperWIthKeyword_B extends SuperWIthKeyword_A {

	public void display() {
		super.display();
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		
		SuperWIthKeyword_B s= new SuperWIthKeyword_B();
		s.display();
		
	}
}
