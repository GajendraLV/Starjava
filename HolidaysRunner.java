class HolidaysRunner {
public static void main(String[] args) {

int monthNumber = 8;
int days = Holidays.daysInMonth(monthNumber);
System.out.println(days);

String country = "India";
String name = Holidays.holidayName(country);
System.out.println(name);

long budget = 2500000L;
long travelers = Holidays.totalTravelers(budget);
System.out.println(travelers);

float seasonTemp = 32.0F;
float avgTemp = Holidays.averageTemperature(seasonTemp);
System.out.println(avgTemp);

double bookingPrice = 5000.0;
double discount = Holidays.hotelDiscount(bookingPrice);
System.out.println(discount);

boolean holidayMonth = true;
boolean peak = Holidays.isPeakSeason(holidayMonth);
System.out.println(peak);

char touristRating = 'B';
char rating = Holidays.tripRating(touristRating);
System.out.println(rating);
}
}
