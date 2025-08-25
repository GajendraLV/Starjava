class Universe{
public static void main(String [] args){
int[] planetCount = {20, 25, 22, 54};      
float [] starBrightness = {5.6f, 25.2f, 25.5f, 65.6f}; 
double [] galaxyDistance = {5588647416d,255454554d, 2555555554d, 255454555d}; 
char [] cosmicSymbol = {'A', 'N', 'g', 'h'};     
String [] galaxyName = {"Andromeda", "Sombrero", "Whirlpool", "Messier"}; 
long [] universeAge = {13800000000L, 15345454L, 15345545L, 1545454L};
boolean [] planetExist = {true, false, true, false};
for(int number = 0; number < planetCount.length; number++){
	System.out.println(planetCount[number]);
}
for(int number = 0; number < starBrightness.length; number++){
	System.out.println(starBrightness[number]);
}
for(int number = 0; number < galaxyDistance.length; number++){
	System.out.println(galaxyDistance[number]);
}
for(int number = 0; number < cosmicSymbol.length; number++){
	System.out.println(cosmicSymbol[number]);
}
for(int number = 0; number < galaxyName.length; number++){
	System.out.println(galaxyName[number]);
}
for(int number = 0; number < universeAge.length; number++){
	System.out.println(universeAge[number]);
}
for(int number = 0; number < planetExist.length; number++){
	System.out.println(planetExist[number]);
}
}
}

