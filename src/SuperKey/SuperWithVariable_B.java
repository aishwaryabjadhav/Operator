package SuperKey;

public class SuperWithVariable_B extends 	SuperWithVariable_A {
int x=20;

public void display() {
	System.out.println(super.x);
	System.out.println(x);

}

public static void main(String[] args) {
	SuperWithVariable_B ss=new SuperWithVariable_B();
	ss.display();

}
}
