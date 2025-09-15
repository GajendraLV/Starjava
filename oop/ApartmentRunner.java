class ApartmentRunner{
public static void main(String [] args){
Apartment apartment=new Apartment();
Floor floor1=new Floor(1,"gaja");
Floor floor2=new Floor(2,"krish");
Floor floor3=new Floor(3,"rama");
Floor floor4=new Floor(4,"arjun");

Floor [] floor={floor1,floor2,floor3,floor4};
apartment.apartments(floor);

}
}