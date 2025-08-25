class Universe{
public static void main(String [] args){
int planetCount = 20;      
float starBrightness = 5.6f; 
double galaxyDistance = 5588647416d; 
char cosmicSymbol = 'A';     
String galaxyName = "Andromeda"; 
long universeAge = 13800000000L;

Object [] show = {planetCount,starBrightness, galaxyDistance, cosmicSymbol, galaxyName, universeAge};
int sahoo = 35;
show[0] = sahoo;

for(int number = 0; number < show.length; number++){
	System.out.println(show[number]);
}
}
}
