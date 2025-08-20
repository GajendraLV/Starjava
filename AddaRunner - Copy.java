class AddaRunner {
public static void main(String[] args) {

int totalChairs = 25;
int chairs = Adda.chairsAvailable(totalChairs);
System.out.println(chairs);

String location = "MG Road";
String name = Adda.addaName(location);
System.out.println(name);

long monthVisitors = 42000L;
long visitors = Adda.totalVisitors(monthVisitors);
System.out.println(visitors);

float currentTeaPrice = 12.0F;
float tea = Adda.teaPrice(currentTeaPrice);
System.out.println(tea);

double burgerPrice = 40.0;
double snacks = Adda.snacksPrice(burgerPrice);
System.out.println(snacks);

boolean weekend = true;
boolean open = Adda.isOpenOnWeekend(weekend);
System.out.println(open);

char customerRating = 'B';
char rating = Adda.serviceRating(customerRating);
System.out.println(rating);
    }
}
