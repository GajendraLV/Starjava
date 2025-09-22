class FoodMenu{
   public String hotelname;
   public int  numberOfItemsOnMenu;
   public Dosa dosa;
   public Paratha paratha;
   public Samosa samosa;  
public FoodMenu(String hotelname,int numberOfItemsOnMenu,Dosa dosa,Paratha paratha,Samosa samosa){

		this.hotelname=hotelname;
		this.numberOfItemsOnMenu=numberOfItemsOnMenu;
		this.dosa=dosa;
		this.paratha=paratha;
		this.samosa=samosa;
}
	public void displayFoodMenuInfo(){
		
		System.out.println("This is FoodMenu class.");
		System.out.println("Hotel Name = "+hotelname);
		System.out.println("Number of items on menu = "+numberOfItemsOnMenu);
		System.out.println("Price of Dosa = "+ dosa.dosaprice);
		System.out.println("Price of Paratha = "+paratha.parathaPrice);
		System.out.println("Price of Samosa = "+ samosa.samosaPrice);
		
	}
}