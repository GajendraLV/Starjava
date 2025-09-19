class StylusPens{
public int Styluspensprice;
public String Styluspensbrand;
public Ink ink;
public StylusPens(int Styluspensprice,String Styluspensbrand,Ink ink){
this.Styluspensprice=Styluspensprice;
this.Styluspensbrand=Styluspensbrand;
this.ink=ink;
}
public void displayStyluspens(){
	System.out.println("NoveltyPens"+Styluspensprice);
	System.out.println("NoveltyPens"+Styluspensbrand);
	System.out.println("NoveltyPens"+ink.inkprice);
	System.out.println("NoveltyPens"+ink.inkbrand);
}
}