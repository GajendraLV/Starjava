public class Employee {
    public int noofemployee;
    public String employeedetails;

    public Employee(int noofemployee, String employeedetails) {
        this.noofemployee = noofemployee;
        this.employeedetails = employeedetails;
    }

    public void industry() {
        System.out.println(noofemployee + ", " + employeedetails);
    }
}
