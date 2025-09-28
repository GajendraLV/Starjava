class Zebra{
public int price;
public String name;
public long speed;
public double percentange;

public Zebra(int price,String name,long speed,double percentange){
this.price=price;
this.name=name;
this.speed=speed;
this.percentange=percentange;
}
public void displayzebra(){
	System.out.println("this is my"+price);
	System.out.println("this is my"+name);
	System.out.println("this is my"+speed);
	System.out.println("this is my"+percentange);
}
}