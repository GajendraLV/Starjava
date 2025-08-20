class FilmsStarGaruda{
public static void main(String [] args){
  
int [] avatar = {12, 25, 56, 85};
price(avatar);
float [] batman = {12.555f, 45.2588f, 89.5555f, 69.1525f};
price(batman);
long [] ramayana = {12354688L, 877844645L, 25454444L, 85469444L};
price(ramayana);
double [] bahubali = {5655555655d, 254888888d, 8885545656d, 236588555d};
price(bahubali);
boolean [] kgf = {true, false, true, false};
price(kgf);
char [] gaja = {'A', 's', 'z', 'r'};
price(gaja);
}
public static void price(int [] avatar ){ 
	for(int number = 0; number<avatar.length; number++){
		System.out.println("good:" +avatar[number]);
	}
}
public static void price(float [] batman){
	for(int number = 0; number<batman.length; number++){
		System.out.println("awesome:"+batman[number]);
	}
}
public static void price(long [] ramayana){
	for(int number = 0; number<ramayana.length; number++){
		System.out.println("Excellent:"+ramayana[number]);
	}
}
public static void price(double [] bahubali){
	for(int number = 0; number<bahubali.length; number++){
		System.out.println("game:"+bahubali[number]);
	}
}
public static void price(boolean [] kgf){
	for(int number = 0; number<kgf.length; number++){
		System.out.println("start:"+kgf[number]);
	}
}
public static void price(char [] gaja){
	for(int number = 0; number<gaja.length; number++){
		System.out.println("start:"+gaja[number]);
	}
}
}
