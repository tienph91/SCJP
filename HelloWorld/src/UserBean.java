
public class UserBean {

    int employeeNo;
    String employeeName;

    public UserBean(int employeeNo, String employeeName) {
        super();
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
    }

    public UserBean() {
        super();
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
