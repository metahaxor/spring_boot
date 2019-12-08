package assign2_backup;

public class Employee {

	private int empid;
	private int empsal,deptid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empsal=" + empsal + ", deptid="
				+ deptid + "]";
	}
	
	
	
}
