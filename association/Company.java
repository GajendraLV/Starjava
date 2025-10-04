class Company{
public int salary;
public Employee employee;
public Company(int salary,Employee employee){
	this.salary=salary;
	this.employee=employee;
}
public void displaycompany(){
	System.out.println("this is"+employee.salary);
	System.out.println("this is"+employee.name);
}
}