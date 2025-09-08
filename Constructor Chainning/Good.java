class Good{
public Good(){
	this(100);
}
public Good(int price){
	this(100, "gaja");
	System.out.println("it is the first argument");
	System.out.println("is it"+price);
}
public Good(int price, String name){
	this(100, "gaja", 25.2f);
	System.out.println("it is the second argument");
	System.out.println("is it"+name);
}
public Good(int price, String name, float num){
	this(100, "gaja", 25.2f, 25655666d);
	System.out.println("it is the third argument");
	System.out.println("is it"+num);
}
public Good(int price, String name, float num, double nums){
	this(100, "gaja", 25.2f, 25655666d, 'A');
	System.out.println("it is the fourth argument");
	System.out.println("is it"+nums);
}
public Good(int price, String name, float num, double nums, char lettar){
	this(100, "gaja", 25.2f, 25655666d, 'A', 3356555555l);
	System.out.println("it is the five argument");
	System.out.println("is it"+lettar);
}
public Good(int price, String name, float num, double nums, char lettar, long phoneNumber){
	System.out.println("it is the six argument");
	System.out.println("is it"+phoneNumber);
}
}