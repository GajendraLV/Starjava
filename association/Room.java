class Room{
public int price;
public Floor floor;
public Room(int price,Floor floor){
	this.price=price;
	this.floor=floor;
}
public void displayroom(){
	System.out.println("this is"+floor.price);
	System.out.println("this is"+floor.name);
}
}