class Student{
public String name;
public Teacher teacher;
public Student(String name, Teacher teacher){
	this.name=name;
	this.teacher=teacher;
}
public void displaystudent(){
	System.out.println("this is Student class");
	System.out.println("the name is "+name);
	System.out.println("the "+teacher.teachername);
}
}