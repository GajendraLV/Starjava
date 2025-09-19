class HospitalRunner {
    public static void main(String[] args) {
        Patient patient = new Patient("Suresh", 100);
        Doctor doctor = new Doctor("Dr. Ramesh",patient);
        patient.displayPatient();
        doctor.displayDoctor();
    }
}
