class Pen{
public int price;
public Book book;
public Pencil pencil;
public Paper paper;
public Pen(int price,Book book,Pencil pencil,Paper paper){
	this.price=price;
	this.book= book;
	this.pencil=pencil;
	this.paper=paper;
}
public void displaypen(){
	System.out.println("this is"+price);
	System.out.println("this is"+book.price);
	System.out.println("this is"+pencil.price);
	System.out.println("this is"+paper.price);
}
}