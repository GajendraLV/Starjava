class Ink{
public int inkprice;
public String inkbrand;
public Ink(int inkprice,String inkbrand){
this.inkprice=inkprice;
this.inkbrand=inkbrand;	
}
public void displayink(){
	System.out.println("NoveltyPens"+inkprice);
	System.out.println("NoveltyPens"+inkbrand);
}
}