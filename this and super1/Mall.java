class Mall{
public int price;
public String mallname;
public char quality;
public double decimal;
public long bill;

public Mall(int price,String mallname,
char quality,double decimal,long bill){
this.price= price;
this.mallname=mallname;
this.quality=quality;
this.decimal=decimal;
this.bill=bill;
}
public void displaymall(){
	System.out.println("this is my"+price);
	System.out.println("this is my"+mallname);
	System.out.println("this is my"+quality);
	System.out.println("this is my"+decimal);
	System.out.println("this is my"+bill);
}
}