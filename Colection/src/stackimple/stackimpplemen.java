package stackimple;

import java.util.Iterator;
import java.util.Stack;

public class stackimpplemen {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.add(12);
		st.push(13);  
		st.add(16);
		Iterator it = st.iterator();
		
		
		while(it.hasNext()) {
			Integer name =(int) it.next();
			if(name ==13)
				System.out.println(name+" ");
		}
	}
}
