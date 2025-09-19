class GelPen{
public int penprice;
public String penbrand;
public Ink ink;
public GelPen(int penprice,String penbrand,Ink ink){
this.penprice=penprice;
this.penbrand=penbrand;
this.ink=ink;
}
public void displaygelpen(){
System.out.println("this is gelpen");
System.out.println("penprice"+penprice);
System.out.println("penbrand"+penbrand);
System.out.println("Ink"+ink.inkprice);
System.out.println("Ink"+ink.inkbrand);
}
}