class Floor{
public int nooffloors;
public String floorDetails;

public Floor(int nooffloors, String floorDetails){
this.nooffloors=nooffloors;
this.floorDetails=floorDetails;
}
public void build(){
	System.out.println(nooffloors+","+floorDetails);
}
}