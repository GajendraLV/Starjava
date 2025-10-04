class CareerRunner{
public static void main(String [] args){
Employee employee=new Employee(200,"gaja");
Company company=new Company(600, employee);	
Google google=new Google(255, employee);
company.displaycompany();
google.displaygoogle();
}
}