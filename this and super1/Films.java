class Films extends Kgf{
public int ticketprice;
public String moviename;
public char rating;
public float collection;
public double budget;
public long audience;
public boolean opinion;
public Films(){
	super();
	System.out.println("this is my films");
} 
public Films(int ticketprice,String moviename,char rating,
float collection,double budget,long audience,boolean opinion){
this();
super.ticketprice=ticketprice;
super.moviename=moviename;
super.rating=rating;
super.collection=collection;
super.budget=budget;
super.audience=audience;
super.opinion=opinion;
}
public void displayFilms(){
	System.out.println("this is my="+super.ticketprice);
	System.out.println("this is my="+super.moviename);
	System.out.println("this is my="+super.rating);
	System.out.println("this is my="+super.collection);
	System.out.println("this is my="+super.budget);
	System.out.println("this is my="+super.audience);
	System.out.println("this is my="+super.opinion);

	System.out.println("this is my="+this.ticketprice);
	System.out.println("this is my="+this.moviename);
	System.out.println("this is my="+this.rating);
	System.out.println("this is my="+this.collection);
	System.out.println("this is my="+this.budget);
	System.out.println("this is my="+this.audience);
	System.out.println("this is my="+this.opinion);
   	
}

}