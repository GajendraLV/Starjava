class Director{
public int directorname;
public Actor actor;
public Producer producer;	
public Director(int directorname,Actor actor,Producer producer){
	this.directorname=directorname;
	this.actor=actor;
	this.producer=producer;
}
public void displaydirector(){
	System.out.println("this is"+actor.remunration);
	System.out.println("this is"+producer.budget);
	System.out.println("this is"+directorname);
}
}