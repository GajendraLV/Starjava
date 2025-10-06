class Technology extends Software{
    public int idNumber;
	public String personName;
	public long phoneNumber;
	public double percentageHSC;
	public float percentageSSC;
	public char rating;
	public boolean isGraduate;
public Technology(){
	super();
	System.out.println("this is no argumental constructor");
}
public Technology(int idNumber,String personName,long phoneNumber,double percentageHSC,
float percentageSSC,char rating,boolean isGraduate){
	this();
	super.idNumber=idNumber;
	super.personName=personName;
	super.phoneNumber=phoneNumber;
	super.percentageHSC=percentageHSC;
	super.percentageSSC=percentageSSC;
	super.rating=rating;
	super.isGraduate=isGraduate;
	
	this.idNumber=idNumber;
	this.personName=personName;
	this.phoneNumber=phoneNumber;
	this.percentageHSC=percentageHSC;
	this.percentageSSC=percentageSSC;
	this.rating=rating;
	this.isGraduate=isGraduate;
}	
public void displayinfo(){
	System.out.println("this is"+super.idNumber);
	System.out.println("this is"+super.personName);
	System.out.println("this is"+super.phoneNumber);
	System.out.println("this is"+super.percentageHSC);
	System.out.println("this is"+super.percentageSSC);
	System.out.println("this is"+super.rating);
	System.out.println("this is"+super.isGraduate);
	
	System.out.println("this is"+this.idNumber);
	System.out.println("this is"+this.personName);
	System.out.println("this is"+this.phoneNumber);
	System.out.println("this is"+this.percentageHSC);
	System.out.println("this is"+this.percentageSSC);
	System.out.println("this is"+this.rating);
	System.out.println("this is"+this.isGraduate);
}	
}