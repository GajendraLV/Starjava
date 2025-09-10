class KingdomRunner{
public static void main(String [] args){
Kingdom kingdom = new Kingdom();
Ministers ministers = new Ministers();
ministers.manager(kingdom);
System.out.println("this is my soldiers="+Kingdom.soldiers);
}
}