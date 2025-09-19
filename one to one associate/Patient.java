class Patient {
public String name;
public int  price;
public Patient(String name,  int  price){
this.name = name;
this.price = price;
}
public void displayPatient() {
System.out.println("This is Patient class");
System.out.println("Patient name: " + name);
System.out.println("Doctor assigned: " +price);
    }
}
