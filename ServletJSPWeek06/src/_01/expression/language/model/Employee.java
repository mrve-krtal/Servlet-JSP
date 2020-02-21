package _01.expression.language.model;

public class Employee {
	
	private int id;
	private String ad;
	private String surname;
	private int salary;
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(int id, String ad, String surname, int salary, Department department) {
		super();
		this.id = id;
		this.ad = ad;
		this.surname = surname;
		this.salary = salary;
		this.department = department;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}