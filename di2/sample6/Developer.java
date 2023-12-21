package sample6;

public class Developer extends Emp {
	private String dept;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	public Developer(String name, int salary) {
		// TODO Auto-generated constructor stub
		super(name, salary);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 부서 : " + dept;
	}
	
}
