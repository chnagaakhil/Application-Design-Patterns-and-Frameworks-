package companiesceos;

public class CEO {
	private String name;
	private int salary;
	private String company;
	public CEO(String name, int salary, String company) {
		super();
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "CEO [name=" + name + ", salary=" + salary + ", company=" + company + "]\n";
	}
	
}
