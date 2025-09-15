class SchoolRunner {
    public static void main(String[] args) {
        School school = new School();

        Staff staff1 = new Staff(1, "Mr. Gaja");
        Staff staff2 = new Staff(2, "Ms. Krish");
        Staff staff3 = new Staff(3, "Mr. Rama");
        Staff staff4 = new Staff(4, "Ms. Arjun");

        Staff[] staffArray = {staff1, staff2, staff3, staff4};

        school.showStaff(staffArray);
    }
}
