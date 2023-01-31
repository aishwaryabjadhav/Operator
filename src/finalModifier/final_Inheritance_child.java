package finalModifier;
//Inheritance is possible when we declare method as final.
public class final_Inheritance_child extends final_inheritance_parent {
public final void m2() {
	System.out.println("m2 of child");
}

public static void main(String[] args) {
	final_Inheritance_child f=new final_Inheritance_child();
	f.m1();
	f.m2();
}
}
