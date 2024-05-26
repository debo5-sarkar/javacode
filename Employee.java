public class Employee {

	String empname;
	int empid;
	private static int count=0;
	public String getEmpname() 
	{
		return empname;
	}
	public void setEmpname(String empname) 
	{
		this.empname = empname;
	}
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	public static int countemp()
	{
		return count;
	}
	
	private Employee(int empid,String empname)
	{
		
		this.empid=empid;
		this.empname=empname;
		count++;
	}
	public static Employee getInstance()
	{
		
		return new Employee(123,"Debo");
	}
	public static void main(String[] args) {
		
		Employee e1=Employee.getInstance();
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
		System.out.println(Employee.countemp());
		
		
		
	}
	
}
