public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        Employee employee1 = new Employee(1, "parashu");
        Employee employee2 = new Employee(2, "gaja");
        Employee employee3 = new Employee(3, "krish");
        Employee employee4 = new Employee(4, "rama");
        Employee[] employees = {employee1, employee2, employee3, employee4};
        company.companys(employees);
    }
}
