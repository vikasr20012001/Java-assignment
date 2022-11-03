package practice;
public class EmployeeComp  {

	private int empid;
    private String empname;
    private double salary;
    private int deptno;
    
    
    public String getEmpname() {
        return empname;
    }
    
    
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        
        if(salary > 0)
        {
          this.salary = salary;
        }
        else
        {
            System.out.println("Enter the Salary greater than 0.");
        }
    }
    public int getDeptno() {
        return deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    public int getEmpid() {
        return empid;
    }

   

	public EmployeeComp(int empid, String empname, double salary, int deptno) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptno = deptno;
	}
    
	
	 
    @Override
	public String toString() {
		return "Employee-Detail:-empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", deptno=" + deptno
				+ ")";
	}


    
}