package comparator;

public class Employee implements Comparable<Employee>{

	int id;
	String Name;
	double Salary;
	
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		Name = name;
		Salary = salary;
	}

	

	public int compareTo(Employee arg) {
		return (int)  (this.id - arg.id);
	}
	
	public int hashCode() {
		return this.id;
	}
	
	public boolean equals(Object arg) {
		return this.hashCode() == arg.hashCode();
	}
	
	public String toString() {
		return "id  :"+id + "  Name :"+Name +"  Salary :"+Salary;
	}
}
