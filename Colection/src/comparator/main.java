package comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
//		Employee e1 = new Employee(101, "Gopi ", 548523);
//		
//		Employee e2 = new Employee(102, "Krish ", 7845);
//		
//		Employee e3 = new Employee(103, "Ramya", 45632);
//		
//		Employee e4 = new Employee(104, "Sowmya", 85412);
//		
//		Employee e5 = new Employee(105, "Geetha", 966321);
//		
//		
//		PriorityQueue<Employee> emp = new PriorityQueue<Employee>();
//		
//		emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);emp.add(e5);
//		
//		for(Employee e : emp) {
//			if(e.id>10) {
//				System.out.println(e);
//			}
//		}
		
		
		Children c1 = new Children("lila", 2);
		Children c2 = new Children("hela", 7);
		Children c3 = new Children("cap", 6);
		Children c4 = new Children("scott", 9);
		Children c5 = new Children("natasha", 10);
		
		
		List<Children> stu = new ArrayList<Children>();
		
		stu.add(c1); stu.add(c2); stu.add(c3); stu.add(c4); stu.add(c5);
		
		for(Children c : stu) {
			if(c.grade>5) {
				System.out.println(c.Name+" "+c.grade);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
