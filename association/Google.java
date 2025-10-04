class Google{
public int salary;
public Employee employee;
public Google(int salary,Employee employee){
	this.salary=salary;
	this.employee=employee;
}
public void displaygoogle(){
	System.out.println("this is "+employee.salary);
	System.out.println("this is "+employee.name);
}
}