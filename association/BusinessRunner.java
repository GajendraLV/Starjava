class BusinessRunner{
public static void main(String [] args){
College college=new College("gaja", "kolar");
Student student=new Student("gaja", 500000);
University university=new University("krish", 454544);
Business business=new Business(college,student,university);
business.displaybusiness();
}
}