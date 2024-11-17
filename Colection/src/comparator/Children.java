package comparator;

public class Children implements Comparable<Children>{

	String Name;
	int grade;
	
	public Children(String name, int grade) {
		Name = name;
		this.grade = grade;
	}
	
	public int compareTo(Children chi) {
		return this.grade - chi.grade;
	}

	
	public String toString() {
		return "Children [Name=" + Name + ", grade=" + grade + "]";
	}
	
	
	
//	public boolean equals(Children em) {
//		return this.hashCode() == em.hListashCode();
//	}
//	
//	public int hashcode() {
//		return this.grade;
//	}
	
}
