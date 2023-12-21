package sample6;

public class Emp {
	private String name;
	private int salary;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 급여 : " + salary;
	}
}
