class FireRunner{
public static void main(String [] args){
Rain rain=new Rain(200, "gaja");
Air air=new Air(100, "raju");
Earth earth=new Earth(500,"balu");
Fire fire=new Fire(100,rain,air,earth);
fire.displayffire();	
}
}