class Food{
public Food(){
	this(100);
}	
public Food(int price){
 this(200,"gaja");	
System.out.println("this is my"+price);	
}
public Food(int price, String name){
	this(500,"gaja", 25.5f);
	System.out.println("this is my"+name);
}
public Food(int price, String name, float nums){
this(600, "gaja", 58.5f, 55465488d);
System.out.println("this is my"+nums);
}
public Food(int price, String name, float nums, double value){
	this(600, "gaja", 55.5f, 546645455d, 'A');
	System.out.println("this is my"+value);
}
public Food(int price, String name, float nums, double value,char symbol){
	this(900, "gaja", 25.5f, 21444d, 'A', 5355565l);
	System.out.println("this is my"+symbol);
}
public Food(int price, String name, float nums, double value, char symbol, long number){
	System.out.println("this is my"+number);
}
}