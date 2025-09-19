class Teacher{
public String  teachername;
public int  teachersalary;
public Teacher(String  teachername,int  teachersalary){
this.teachername=teachername;
this.teachersalary=teachersalary;
}
public void displayteacher(){
	System.out.println("this is teacher class");
	System.out.println(teachername);
	System.out.println(teachersalary);
}
}