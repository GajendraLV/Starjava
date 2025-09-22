class University {
    public String name;
    public Teacher teacher;
    public Student student;
    public Subject subject;

    public University(String name, Teacher teacher, Student student, Subject subject) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
    }

    public void displayUniversityInfo() {
        System.out.println("This is University Information:");
        System.out.println("University Name: " + name);
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Student: " + student.name);
        System.out.println("Subject: " + subject.subjectName);
    }
}
