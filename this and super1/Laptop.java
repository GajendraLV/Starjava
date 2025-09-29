class Laptop{
public int price;
public Phone phone;
public Laptop(int price,Phone phone){
	this.price=price;
	this.phone=phone;
}
public void displayLaptop(){
	System.out.println("this is my"+phone.price);
	System.out.println("this is my"+phone.name);
	System.out.println("this is my"+price);
}
}