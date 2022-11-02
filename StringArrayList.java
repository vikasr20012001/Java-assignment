package mypac;

import java.util.ArrayList;
import java.util.List;
import mypac.Employ;
public class Array {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("vikas");
		lst.add("suny");
		lst.add("ravu");
		lst.add("bali");
		
		System.out.println(lst);
		System.out.println(lst.size());
		
		lst.remove(0);
		System.out.println(lst);
		

	}

}
