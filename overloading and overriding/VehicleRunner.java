class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); 
        vehicle.stop();  

       

        Car car = new Car();
        car.start(); 
        car.stop();  
        car.openTrunk(); 


      
        Vehicle polyVehicle = new Car();
        polyVehicle.start(); 
        polyVehicle.stop();  
       
    }
}