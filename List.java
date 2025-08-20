class List {
public static void main(String [] args) {
int sparrow = 25;
int peacock = 36;
int swan  = 87;
int bat = 58;
int duck = 56;

int [] rollnumber = {sparrow, peacock, swan, bat, duck};

int owl = 98;
rollnumber[4] = owl;

for(int number = 0; number < rollnumber.length; number++) {
            int print = rollnumber[number];
System.out.println("Roll number = " + print);
}
long indiapopulation = 1400000L;
long chinapopulation = 1500000L;
long americapopulation = 850000L;
long japanpopulation = 210000L;
long russiapopulation = 5000000L;

long [] phonenumber = {indiapopulation, chinapopulation, americapopulation, japanpopulation, russiapopulation};

long space = 28;
phonenumber[4] = space;

for(int number = 0; number < phonenumber.length; number++) {
            long print = phonenumber[number];
System.out.println("Phone number = " + print);
        }

float marks = 10f;
float percentage1 = 17f;
float temperature = 45f;
float speed = 78f;
float dummy = 50f;

float [] sharesPercentage = {marks, percentage1, temperature, speed, dummy};

float shares = 85f;
sharesPercentage[4] = shares;

for(int number = 0; number < sharesPercentage.length; number++) {
            float print = sharesPercentage[number];
System.out.println("Shares percentage = " + print);
}

double piValue = 3.14159265359;
double gravity = 9.80665;
double distance = 384400.75;
double weightOnEarth = 65.789;
double stockPrice = 1520.4567;

double [] earth = {piValue, gravity, distance, weightOnEarth, stockPrice};

double nami = 60.0;
earth[4] = nami;

for(int number = 0; number < earth.length; number++) {
            double print = earth[number];
System.out.println("Percentage = " + print);
}

boolean nico = true;
boolean robin = true;
boolean jimbei = true;
boolean brook = false;
boolean chopper = true;

boolean [] passedTheExam = {nico, robin, jimbei, brook, chopper};

boolean franky = false;
passedTheExam[4] = franky;

for(int number = 0; number < passedTheExam.length; number++) {
            boolean print = passedTheExam[number];
System.out.println("Passed the exam = " + print);
}

char akainu = 'a';
char aokiji = 'b';
char roger = 'c';
char zebek = 'd';
char garp = 'a';

char [] grades = {akainu, aokiji, roger, zebek, garp};

char sengoku = 'd';
        grades[4] = sengoku;

for(int number = 0; number < grades.length; number++) {
            char print = grades[number];
System.out.println("Grades = " + print);
        }
    }
}
