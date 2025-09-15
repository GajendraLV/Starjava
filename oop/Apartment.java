class Apartment{
public void apartments(Floor [] floor){
System.out.println(floor.length);
for(int num=0; num<floor.length; num++){
	Floor build=floor[num];
	build.build();	
}
}
}
