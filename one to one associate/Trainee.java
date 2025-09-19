class Trainee{
	
public int noofstudent;
public String traineenames;
public Trainner trainner;

public Trainee(int noofstudent,String traineenames,Trainner trainner ){
	this.noofstudent=noofstudent;
	this.traineenames=traineenames;
	this.trainner=trainner;
}
public void display(){
	System.out.println("This is trainee class");
	System.out.println("Number of students ="+noofstudent);
	System.out.println("Names of trainees ="+traineenames);
	System.out.println("Name of trainer ="+trainner.name);
}


}

