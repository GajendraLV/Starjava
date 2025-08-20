class FestivalRunner {
public static void main(String[] args) {

int year = 2025;
int date = Festival.date(year);
System.out.println(date);

String month = "October";
String name = Festival.festivalName(month);
System.out.println(name);

long expectedVisitors = 1000000L;
long people = Festival.numberOfPeople(expectedVisitors);
System.out.println(people);

float givenPrice = 120.0F;
float price = Festival.ticketPrice(givenPrice);
System.out.println(price);

double givenDiscount = 8.5;
double discount = Festival.discountOnFood(givenDiscount);
System.out.println(discount);

boolean officialHoliday = true;
boolean holiday = Festival.isNationalHoliday(officialHoliday);
System.out.println(holiday);

char givenRating = 'B';
char rating = Festival.festivalRating(givenRating);
System.out.println(rating);
    }
}
