class School {
    public String name;
    public Teacher teacher;
    public Student student;
    public Subject subject;

    public School(String name, Teacher teacher, Student student, Subject subject) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
    }

    public void displaySchoolInfo() {
        System.out.println("This is School Information:");
        System.out.println("School Name: " + name);
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Student: " + student.name);
        System.out.println("Subject: " + subject.subjectName);
    }
}
