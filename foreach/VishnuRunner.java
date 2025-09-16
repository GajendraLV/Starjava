class VishnuRunner{
public static void main(String [] args){
Vishnu vishnu=new Vishnu();
Shiva shiva1=new Shiva(20,"gaja");
Shiva shiva2=new Shiva(30, "ganesh");
Shiva shiva3=new Shiva(40,"subramani");
Shiva shiva4=new Shiva(50,"graha");
Shiva [] create={shiva1,shiva2,shiva3,shiva4};
vishnu.protect(create);
}
}