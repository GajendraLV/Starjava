class Time{
public Time(){
	this(100);
}
public Time(int price){
	this(500,"gaja");
	System.out.println("this is"+price);
}
public Time(int  price, String name){
	this(500, "gaja", 'A');
	System.out.println("this is"+name);
}
public Time(int price, String name, char symbol){
	this(600, "gaja", 'A', 2554544d);
	System.out.println("this is"+symbol);
}
public Time(int price, String name, char symbol, double value){
	this(400, "gaja", 'S', 21545645d, 25.2f);
	System.out.println("this is"+value);
}
public Time(int price, String name, char symbol, double value, float num){
	this(900,"gaja", 'V', 6586458665d, 25665f, 254545435l);
	System.out.println("this is"+num);
}
public Time(int price, String name, char symbol, double value, float num, long numbers){
	System.out.println("this is"+numbers);
}	
}
