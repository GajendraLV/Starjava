class Person {
    
    public int idNumber;
    public String personName;
    public long phoneNumber;
    public double percentageHSC;
    public float percentageSSC;
    public char rating;
    public boolean isGraduate;

    public Person() {
        System.out.println("This is no argumental constructor in Person class.");
    }

    public Person(int idNumber, String personName, long phoneNumber, double percentageHSC, 
                  float percentageSSC, char rating, boolean isGraduate) {
        this.idNumber = idNumber;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.percentageHSC = percentageHSC;
        this.percentageSSC = percentageSSC;
        this.rating = rating;
        this.isGraduate = isGraduate;
        System.out.println("This is parameterized constructor in Person class.");
    }
}
