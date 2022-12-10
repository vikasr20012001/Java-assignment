package practice;

import java.util.Comparator;

public class CompareEmpDept implements Comparator<EmployeeComp> {

	  @Override
	  public int compare(EmployeeComp e1 , EmployeeComp e2)
	  {
		  return  (e1.getDeptno() - e2.getDeptno());
	  }
}