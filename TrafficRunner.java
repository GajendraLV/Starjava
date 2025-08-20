class TrafficRunner {
public static void main(String[] args) {

int peakHours = 8;
int timing = Traffic.signalTiming(peakHours);
System.out.println(timing);

String area = "Bangalore Central";
String roadName = Traffic.busyRoadName(area);
System.out.println(roadName);

long dailyCount = 120000L;
long vehicles = Traffic.totalVehicles(dailyCount);
System.out.println(vehicles);

float currentSpeed = 40.0F;
float avgSpeed = Traffic.averageSpeed(currentSpeed);
System.out.println(avgSpeed);

double overSpeedFine = 500.0;
double fine = Traffic.fineAmount(overSpeedFine);
System.out.println(fine);

boolean rain = true;
boolean jam = Traffic.isTrafficJam(rain);
System.out.println(jam);

char citizenRating = 'B';
char rating = Traffic.trafficRating(citizenRating);
System.out.println(rating);
    }
}
