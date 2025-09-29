class Clock{
public Clock(){
	this(100);
}
public Clock(int price){
	this(200,"gaja");
	System.out.println("this is "+price);
}
public Clock(int price, String name){
	this(512,"gaja", 'A');
	System.out.println("this is"+name);
}
public Clock(int price, String name, char symbol){
	this(600,"gaja",'B', 354545454d);
	System.out.println("this is"+symbol);
}
public Clock(int price, String name, char symbol, double decimal){
	this(800,"gaja",'C',25455454d, 2454888f);
	System.out.println("this is"+decimal);
}
public Clock(int price, String name,char symbol, double decimal, float nums){
 this(600, "gaja", 'S',  2544456d, 2565f, 23556885884l);
 System.out.println("this is"+nums);
}
public Clock(int price, String name, char symbol, double decimal, float nums,long numbers){
	System.out.println("this is"+numbers);
}
}