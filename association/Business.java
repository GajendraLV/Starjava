class Business{
public College college;
public Student student;
public University university;
public Business(College college,Student student,University university){
	this.college=college;
	this.student=student;
	this.university=university;
}
public void displaybusiness(){
	System.out.println("this is"+college.name);
	System.out.println("this is"+college.location);
	System.out.println("this is"+student.name);
	System.out.println("this is"+student.fees);
	System.out.println("this is"+university.name);
	System.out.println("this is"+university.price);
}
}
