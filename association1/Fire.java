class Fire{
public int price;
public Rain rain;
public Air air;
public Earth earth;
public Fire(int price,Rain rain,Air air,Earth earth){
	this.price=price;
	this.rain=rain;
	this.air=air;
	this.earth=earth;
}
public void displayffire(){
	System.out.println("this is my"+rain.price);
	System.out.println("this is my"+rain.name);
	System.out.println("this is my"+air.price);
	System.out.println("this is my"+air.name);
	System.out.println("this is my"+earth.price);
	System.out.println("this is my"+earth.name);
}
}