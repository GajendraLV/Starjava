class Pencil{
public int price;
public Book book;
public Paper paper;
public Pen pen;
public Pencil(int price,Book book,Paper paper,Pen pen){
	this.price=price;
	this.book=book;
	this.paper=paper;
	this.pen=pen;
}
public void displaypencil(){
	System.out.println("this is"+price);
	System.out.println("this is"+book.price);
	System.out.println("this is"+paper.price);
	System.out.println("this is"+pen.price);
}
}