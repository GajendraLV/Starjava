class SolarSystem{
public static int solar(String name, int price){

int solar = 0;

if(name == "panel" && price < 1000){
solar = 200;
System.out.println("light:"+solar);
}
else if(name == "wire" && price < 2000){
solar = 500;
System.out.println("light:"+solar);
}
else if(name == "switch" && price < 3000){
solar = 600;
System.out.println("light:"+solar);
}
else if(name == "sun" && price < 4000){
	solar = 700;
	System.out.println("light:"+solar);
}
else if(name == "rays" && price < 5000){
	solar = 800;
	System.out.println("light:"+solar);
}
else if(name == "power" && price < 6000){
	solar = 900;
	System.out.println("light:"+solar);
}
else if(name == "sheild" && price < 7000){
	solar = 1000;
	System.out.println("light:"+solar);
}
else if(name == "energy" && price < 8000){
	solar = 1100;
	System.out.println("light:"+solar);
}
else if(name == "gravity" && price < 9000){
	solar = 1200;
	System.out.println("light:"+solar);
}
else {
	System.out.println("not there");
}
return solar;
}
}

