class Producer{
public int budget;
public Actor actor;
public Director director;
public Producer(int budget,Actor actor,Director director){
	this.budget=budget;
	this.actor=actor;
	this.director=director;
}
public void displayproducer(){
	System.out.println("this is"+actor.remunration);
	System.out.println("this is"+director.directorname);
	System.out.println("this is"+budget);
}
}