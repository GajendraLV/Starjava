class StoryRunner {
public static void main(String[] args) {

int plannedChapters = 15;
int chapters = Story.totalChapters(plannedChapters);
System.out.println(chapters);

String genre = "Fantasy";
String title = Story.storyTitle(genre);
System.out.println(title);

long writtenWords = 68000L;
long words = Story.totalWords(writtenWords);
System.out.println(words);

float estimatedTime = 6.0F;
float time = Story.readingTime(estimatedTime);
System.out.println(time);

double printingCost = 10000.0;
double cost = Story.publishingCost(printingCost);
System.out.println(cost);

boolean positiveReviews = true;
boolean bestSeller = Story.isBestSeller(positiveReviews);
System.out.println(bestSeller);

char givenRating = 'B';
char rating = Story.authorRating(givenRating);
System.out.println(rating);
    }
}
