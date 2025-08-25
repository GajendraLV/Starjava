class Cloths{
public static int clothprice(String type, int price){
int clothsprice = 0;

if(type == "shirt" && price < 1000){
	clothsprice = 900;
	System.out.println("cloth price:"+clothsprice);
}	
else if(type == "tshirt" && price < 2000){
	clothsprice = 400;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "formal" && price < 3000){
	clothsprice = 500;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "jeans" && price < 4000){
	clothsprice = 600;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "formalpant" && price < 5000){
	clothsprice = 700;
	System.out.println("cloth price :"+clothsprice);
}
else if(type == "formal shirt" && price < 6000){
	clothsprice = 800;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "casul pant" && price < 7000){
	clothsprice = 900;
	System.out.println("cloth price:" +clothsprice);
}
else if(type == "casual shirt" && price < 8000){
	clothsprice = 1000;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "suit" && price < 9000){
	clothsprice = 1100;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "western" && price < 10000){
	clothsprice = 1200;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "dhoti" && price < 11000){
	clothsprice = 1300;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "blazer" && price < 12000){
	clothsprice = 1400;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "shorts" && price < 1300){
	clothsprice = 1500;
	System.out.println("cloth price:"+clothsprice);
}
else if(type == "kurtha" && price < 1400){
	clothsprice = 1600;
	System.out.println("cloth price:" +clothsprice);
}
else{
	System.out.println("not there");
}
return clothsprice;
}
}