class FlowerRunner{
public static void main(String [] args){
Tree tree=new Tree(100,"gaja");
Land land=new Land(500,tree);
Water water=new Water(400,tree);
Flower flower=new Flower(800,tree);
land.displayland();
water.displaywater();
flower.displayflower();
}
}