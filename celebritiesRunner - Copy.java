class CelebritiesRunner {
public static void main(String[] args) {

int birthYear = 1989;
int celebAge = Celebrities.age(birthYear);
System.out.println(celebAge);

String industry = "Tollywood";
String name = Celebrities.celebrityName(industry);
System.out.println(name);

long estimatedWorth = 120000000L;
long worth = Celebrities.netWorth(estimatedWorth);
System.out.println(worth);

float givenHeight = 6.0F;
float height = Celebrities.height(givenHeight);
System.out.println(height);

double firstWeekCollection = 210.5;
double earnings = Celebrities.movieEarnings(firstWeekCollection);
System.out.println(earnings);

boolean globalFame = true;
boolean famous = Celebrities.isFamous(globalFame);
System.out.println(famous);

char givenRating = 'B';
char rating = Celebrities.fanRating(givenRating);
System.out.println(rating);
    }
}
