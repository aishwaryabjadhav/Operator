package finalModifier;

public class final_method_child extends final_method{

	public void m1() { // can not override the final method 
		System.out.println("m1 method of child class");
	}
	
	public static void main(String[] args) {
		final_method_child f=new final_method_child();
		f.m1();
	}
}
