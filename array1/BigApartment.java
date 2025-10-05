class BigApartment{
	
	public void apartments(ApartmentFloors[] floors){
		
		for(int num=0; num<floors.length; num++){
			
			ApartmentFloors floorsDetails=floors[num];
	
			floorsDetails.floorsInfo();
		}
	}
}