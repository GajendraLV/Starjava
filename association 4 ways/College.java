class College {
    public String name;
    public Teacher teacher;
    public Student student;
    public Subject subject;

    public College(String name, Teacher teacher, Student student, Subject subject) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
    }

    public void displayCollegeInfo() {
        System.out.println("This is College Information:");
        System.out.println("College Name: " + name);
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Student: " + student.name);
        System.out.println("Subject: " + subject.subjectName);
    }
}