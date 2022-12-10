package practice;
import java.util.*;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<String>();
		name.add("vik");
		name.add("vika");
		name.add("vikas");
		System.out.println(name.get(2));
		LinkedList l=new LinkedList();
		
		
		ListIterator<String> i=name.listIterator(name.size());
		while (i.hasPrevious()) {
			String s=i.previous();
			System.out.println(s);
			
		}
		
		name.forEach(e->{
			System.out.println(e);
		});
		
		TreeSet<String> s=new TreeSet<>();
		s.addAll(name);
		s.forEach(str->System.out.println(str));
		
HashMap<String, Integer> course=new HashMap<>();
course.put("java", 200);
course.put("java", 200);
course.put("java", 200);
course.put("java", 200);
System.out.println(course);



	}
}