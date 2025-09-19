class Doctor{
    public String doctorName;
    public  Patient  patient;

    public Doctor(String doctorName, Patient  patient) {
        this.doctorName = doctorName;
        this.patient = patient;
    }

    public void displayDoctor() {
        System.out.println("This is Doctor class");
        System.out.println("Doctor name: " + doctorName);
        System.out.println("Specialization: " + patient.name);
    }
}