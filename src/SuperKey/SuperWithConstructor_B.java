package SuperKey;

public class SuperWithConstructor_B extends SuperWithConstructor_A  {

	public SuperWithConstructor_B() {
	super();
    System.out.println("Child constructor");
}
	public static void main(String[] args) {
		SuperWithConstructor_B s=new SuperWithConstructor_B();
	}
}
