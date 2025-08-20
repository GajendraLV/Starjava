class DestinationRunner {
public static void main(String[] args) {

int fromCityKm = 500;
int km = Destination.distance(fromCityKm);
System.out.println(km);

String country = "India";
String name = Destination.destinationName(country);
System.out.println(name);

long yearlyCount = 2200000L;
long visitors = Destination.annualVisitors(yearlyCount);
System.out.println(visitors);

float seasonTemp = 30.0F;
float temp = Destination.averageTemperature(seasonTemp);
System.out.println(temp);

double currentRate = 4000.0;
double price = Destination.hotelPrice(currentRate);
System.out.println(price);

boolean popularForBeach = true;
boolean beach = Destination.isBeach(popularForBeach);
System.out.println(beach);

char givenRating = 'B';
char rating = Destination.travelRating(givenRating);
System.out.println(rating);
    }
}
