class Orange{
	public int price;
	public Apple apple;
public Orange(int price,Apple apple){
	this.price=price;
	this.apple=apple;
}
public void displayorange(){
	
	System.out.println("this is "+apple.price);
	System.out.println("this is "+apple.name);
	System.out.println("this is "+price);
}
}