package classesobjectsencapsulation;

class Employee
{
	private int pii;
	
	private String employeeName;
	
	private String phoneNo;
	
    private String designation;

	public Employee(int pii, String employeeName, String phoneNo, String designation) {
		super();
		this.pii = pii;
		this.employeeName = employeeName;
		this.phoneNo = phoneNo;
		this.designation = designation;
	}

	public int getPii() {
		return pii;
	}

	public void setPii(int pii) {
		this.pii = pii;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
    
}

public class Question2
{
	public static void main(String[] args)
	{
		Employee e=new Employee(12,"SURESH","9374827372","HOUSEKEEPING");
		System.out.println("EMPLOYEE PII:"+e.getPii()+"\nEMPLOYEE NAME:"+e.getEmployeeName()+"\nEMPLOYEE PHONE NO:"+e.getPhoneNo()+"\nEMPLOYEE DESIGNATION:"+e.getDesignation());
		
		
	}
}
	
	
	

