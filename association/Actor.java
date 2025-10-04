class Actor{
public int remunration;
public Producer producer;
public Actor(int remunration,Producer producer){
	this.remunration=remunration;
	this.producer=producer;
}	
public void displayactor(){
System.out.println("this is "+producer.budget);	
System.out.println("this is "+remunration);	
}
}