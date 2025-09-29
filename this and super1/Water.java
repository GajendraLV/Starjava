class Water{
public int price;
public Tree tree;
public Water(int price,Tree tree){
	this.price=price;
	this.tree=tree;
}
public void displaywater(){
	System.out.println("this is my"+tree.price);
	System.out.println("this is my"+tree.name);
	System.out.println("this is my"+price);
	System.out.println("this is my"+tree);
}
}
