package setterAndgetter;

public class setterGetter {

	public int id=10;
	public int age=20;
	String sname="Aish";
	String dept="IT";
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

	@Override
	public String toString() {
		return "setterGetter [id=" + id + ", age=" + age + ", sname=" + sname + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
		
		setterGetter s=new setterGetter();
		s.id=100;
		s.age = 25;
		s.dept="IT";
		s.sname="Dipti";
		
		System.out.println(s);
		
		
		
	}
	
	
}
