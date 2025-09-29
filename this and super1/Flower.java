class Flower{
public int price;
public Tree tree;
public Flower(int price,Tree tree){
	this.price=price;
	this.tree=tree;
}
public void displayflower(){
	System.out.println("this is my"+tree.price);
	System.out.println("this is my"+tree.name);
	System.out.println("this is my"+price);
	System.out.println("this is my"+tree);
}
}