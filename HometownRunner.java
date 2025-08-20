class HometownRunner {
public static void main(String[] args) {

int year = 2025;
int people = Hometown.population(year);
System.out.println(people);

String district = "Kolar District";
String name = Hometown.townName(district);
System.out.println(name);

long stateFunding = 150000000L;
long budget = Hometown.annualBudget(stateFunding);
System.out.println(budget);

float surveyRate = 82.0F;
float literacy = Hometown.literacyRate(surveyRate);
System.out.println(literacy);

double measuredSize = 123.45;
double size = Hometown.areaSize(measuredSize);
System.out.println(size);

boolean famousForCulture = true;
boolean tourist = Hometown.isTouristSpot(famousForCulture);
System.out.println(tourist);

char givenGrade = 'B';
char grade = Hometown.cleanlinessGrade(givenGrade);
System.out.println(grade);
    }
}
