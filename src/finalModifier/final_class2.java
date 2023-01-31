package finalModifier;

public class final_class2 extends final_class{

	public void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		final_class2 f1=new final_class2();
		f1.m1();
		f1.m2();
	}
	
}
