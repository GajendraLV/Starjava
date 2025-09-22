class EducationRunner {
    public static void main(String[] args) {
        Teacher schoolTeacher = new Teacher("Mr. Ramesh");
        Teacher collegeTeacher = new Teacher("Dr. Suresh");
        Teacher universityTeacher = new Teacher("Prof. Kumar");

        Student schoolStudent = new Student("Anu");
        Student collegeStudent = new Student("Vikram");
        Student universityStudent = new Student("Divya");

        Subject schoolSubject = new Subject("Mathematics");
        Subject collegeSubject = new Subject("Computer Science");
        Subject universitySubject = new Subject("Data Science");

        School school = new School("Sunrise High School", schoolTeacher, schoolStudent, schoolSubject);
        College college = new College("City Engineering College", collegeTeacher, collegeStudent, collegeSubject);
        University university = new University("National University", universityTeacher, universityStudent, universitySubject);

        school.displaySchoolInfo();
        college.displayCollegeInfo();
        university.displayUniversityInfo();
    }
}