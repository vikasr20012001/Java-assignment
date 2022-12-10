package practice;
import java.util.*;
public class EmpMainComp {

	public static void main(String[] args) {
	

		
				Comparator<EmployeeComp> cemp = new CompareEmpDept();		
				SortedSet<EmployeeComp> set = new TreeSet<EmployeeComp>(cemp);
				
				EmployeeComp e = new EmployeeComp(1002,"Dipak More",34500,10);
				EmployeeComp e1 = new EmployeeComp(1009,"Harshit",35500,20);
				EmployeeComp e2 = new EmployeeComp(1028,"Vikas",30500,29);
				EmployeeComp e3 = new EmployeeComp(1034,"Rohit",33500,12);
				EmployeeComp e4 = new EmployeeComp(1022,"Hardik",37500,15);
				
				set.add(e);
				set.add(e1);
				set.add(e2);
				set.add(e3);
				set.add(e4);
				
				System.out.println(set);  
				System.out.println(set.size());
		}
			
		     




		

	

}
