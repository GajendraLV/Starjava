class Politics{
	public int price;
	public String politianName;
	public float politianserial;
	public char politicalsymbol;

	public Politics(int price,String politianName,
	float politianserial,char politicalsymbol){
		this.price=price;
		this.politianName=politianName;
		this.politianserial= politianserial;
		this.politicalsymbol=politicalsymbol;
	}
	public void displayPolitics(){
		System.out.println("this is my"+price);
		System.out.println("this is my"+politianName);
		System.out.println("this is my"+politianserial);
		System.out.println("this is my"+politicalsymbol);
	}
}