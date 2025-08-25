class Gadgets{
public static int createGadgets(String name, int price){
	int amount = 0;
if(name == "tablet" || price < 5000){
	amount = 4500;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "laptop" || price < 4000){
	amount = 6000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "smartphone" || price < 8000){
	amount = 3000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "powerbank" || price < 9000){
	amount = 2000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "earbuds" || price < 8000){
	amount = 4000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "bluetooth" || price < 6000){
	amount = 6000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "digitalcamera" || price < 9000){
	amount = 7000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "smarTv" || price < 6000){
	amount = 5000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "smartlock" || price < 4500){
	amount = 4000;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "fitnesstracker" ||  price < 2000){
	amount = 1500;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "smartglasses" || price < 6500){
	amount = 5500;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "vrheadset" || price < 8500){
	amount = 6400;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "smartring" || price < 9500){
	amount = 8500;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "cyberband" || price < 1200){
	amount = 1150;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "skydrone" || price < 1300){
	amount = 1250;
	System.out.println("get that:"+amount);
	return amount;
}
else if(name == "airlens" || price < 1400){
	amount = 1350;
	System.out.println("get that:"+amount);
	return amount;
}
else{
	System.out.println("i did't get anything");
}
return amount;
}
}