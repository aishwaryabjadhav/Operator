package finalModifier;
//final with variable: Once we declare variable as final then we can't perform any changes into that variable.

public class final_variable {

	public static void main(String[] args) {
		
		final int a=10;
		System.out.println("final variable a="+a);
		a=20;// we cant reassign value to final variable
		
	}
}
