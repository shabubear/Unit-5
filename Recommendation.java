import java.util.Scanner;

public class Recommendation {
    public static void main(String[] args) {
        introduction();
        System.out.println("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println();
        int age = 0;
        while (age < 3 || age > 117) {
            System.out.println("Age: ");
            age = scanner.nextInt();
            if (age < 3 || age > 117) {
                System.out.println("Invalid age, please retry");
                System.out.println();
                continue;
            }
        }

        System.out.println();
        String wafcakes = "blank";
        scanner.nextLine();
        while (!(wafcakes.toLowerCase().equals("pancakes") || wafcakes.toLowerCase().equals("waffles"))) {
            System.out.println("Pancakes or waffles?");
            wafcakes = scanner.nextLine();
            if (!(wafcakes.toLowerCase().equals("pancakes") || wafcakes.toLowerCase().equals("waffles"))) {
                System.out.println("Invalid answer, please retry");
                System.out.println();
                continue;
            }
        }

        System.out.println();
        String historath = "blank";
        while (!(historath.toLowerCase().equals("history") || historath.toLowerCase().equals("math"))) {
            System.out.println("History or math?");
            historath = scanner.nextLine();
            if (!(historath.toLowerCase().equals("history") || historath.toLowerCase().equals("math"))) {
                System.out.println("Invalid answer, please retry");
                System.out.println();
                continue;
            }
        }

        scanner.close();

        String movie = "idk";
        if (age < 14) {
            if (wafcakes.toLowerCase().equals("pancakes")) {
                movie = "Spider-Man: Into the Spider-Verse/Across the Spider-Verse (if you've already seen the first one)";
            } else {
                movie = "The Incredibles";
            }
        } else if (wafcakes.toLowerCase().equals("waffles") && historath.toLowerCase().equals("history")) {
            movie = "The Wild Robot";
        } else if (age > 13 && age < 40)
            if (historath.toLowerCase().equals("math")) {
                movie = "Project Hail Mary";
            } else {
                movie = "The Mandalorian and Grogu";
            }
        else if (age > 39) {
            if (historath.toLowerCase().equals("math")) {
                movie = "You Can See Everything, which is technically a documentary, but is shot more like a movie";
            } else {
                movie = "Schindler's List";
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Hi " + name + ", it was nice getting to know you a little bit from these questions!");
        System.out.println("I think a movie you might enjoy is " + movie + ".");
    }

    public static void introduction() {
        System.out.println("Hi! I heard you were looking for a movie recommendation!");
        System.out.println("This tool you are about to use will collect some information");
        System.out.println("about you and tell you a movie that you may like!");
        System.out.println("(the results will definitely be very very accurate)");
        System.out.println("You can begin by filling out the prompts below.");
        System.out.println();
    }
}
