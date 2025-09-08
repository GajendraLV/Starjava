class Chutki{
public Chutki(){
	this(100);
}
public Chutki(int price){
	this(100, "gaja");
	System.out.println("it is first argment");
	System.out.println("it is "+price);
}
public Chutki(int price, String name){
	this(100, "gaja", 'a');
	System.out.println("it is second argument");
	System.out.println("it is"+name);
}
public Chutki(int price, String name, char symbol){
	this(100,"gaja", 'a', 215555555d);
	System.out.println("it is third argument");
	System.out.println("it is"+symbol);
}
public Chutki(int price, String name, char symbol, double number){
	this(100, "gaja", 'a', 215555555d, 3555555442L);
	System.out.println("it is fourth argument");
	System.out.println("it is"+number);
}
public Chutki(int price, String name, char symbol, double number, long phoneNumber){
	this(100, "gaja", 'a', 2155555555d, 355555544L, 25.2f);
	System.out.println("it is fifth argument");
	System.out.println("it is"+phoneNumber);
}
public Chutki(int price, String name, char symbol, double number, long phoneNumber, float nums){
	System.out.println("it is sixth argumnet");
	System.out.println("it is"+nums);
}
}
