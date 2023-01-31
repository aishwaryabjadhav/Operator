package finalModifier;

public class method_overloading_final {
	public final  void add(int a,int b) {
		int c=a+b;
		System.out.println( c);
	}
	
	public final  void add(int a,int b,int c) {
		int d=a+b+c ;
		System.out.println( c);
	}
	
	public static void main(String[] args) {

		method_overloading_final m=new method_overloading_final();
		m.add(20,30);
		m.add(10,220, 440);
	}
}
