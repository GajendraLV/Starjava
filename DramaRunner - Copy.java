class DramaRunner {
public static void main(String[] args) {

int writtenYear = 2022;
int year = Drama.releaseYear(writtenYear);
System.out.println(year);

String genre = "Historical";
String name = Drama.dramaName(genre);
System.out.println(name);

        long openingDayAudience = 100000L;
        long audience = Drama.totalAudience(openingDayAudience);
        System.out.println(audience);

        float givenDuration = 3.0F;
        float hours = Drama.duration(givenDuration);
        System.out.println(hours);

        double weekendPrice = 200.0;
        double price = Drama.ticketPrice(weekendPrice);
        System.out.println(price);

        boolean criticalAcclaim = true;
        boolean hit = Drama.isHit(criticalAcclaim);
        System.out.println(hit);

        char givenRating = 'B';
        char rating = Drama.audienceRating(givenRating);
        System.out.println(rating);
    }
}
