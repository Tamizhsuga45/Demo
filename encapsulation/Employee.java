package encapsulation;

public class Employee {
	private int Empid;
	public String name;
	public String deptname;
	protected String location;
	
	
	public int getEmpid()
	{
		return Empid;
	}
	public void setEmpid(int Empid)
	{
		this.Empid=Empid;
	}
	
	
	
	 protected void display(){
	        System.out.println("I'm protected inside class employee");
	    }
	
	

}
