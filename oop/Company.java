public class Company {
    public void companys(Employee[] employee) {
        System.out.println( employee.length);
        for (int num = 0; num < employee.length; num++) {
            Employee industry = employee[num];
            industry.industry();
        }
    }
}
