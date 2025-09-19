class NoveltyPens{
public int noveltypensprice;
public String noveltypensbrand;
public Ink ink;
public NoveltyPens(int noveltypensprice, String noveltypensbrand,Ink ink){
this.noveltypensprice=noveltypensprice;
this.noveltypensbrand=noveltypensbrand;
this.ink=ink;
}
public void displayNoveltyPens(){
	System.out.println("NoveltyPens"+noveltypensprice);
	System.out.println("NoveltyPens"+noveltypensbrand);
	System.out.println("NoveltyPens"+ink.inkbrand);
	System.out.println("NoveltyPens"+ink.inkprice);	
}
}