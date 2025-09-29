class Paper{
public int price;
public Pen pen;
public Pencil pencil;
public Paper paper;
public Paper(int price,Pen pen,Pencil pencil,Paper paper){
this.price=price;
this.pen=pen;
this.pencil=pencil;
this.paper=paper;	
}
public void displaypaper(){
	System.out.println("this is"+pen.price);
	System.out.println("this is"+pencil.price);
	System.out.println("this is"+paper.price);
	System.out.println("this is"+price);
}

}