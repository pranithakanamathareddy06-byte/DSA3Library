import java.util.*;

class Polynomial {
    String name;
    int taste;
    int spicy;
    int price;
    int rating;

    Polynomial(String name, int taste, int spicy, int price, int rating) {
        this.name = name;
        this.taste = taste;
        this.spicy = spicy;
        this.price = price;
        this.rating = rating;
    }

    double calculateScore() {

        double priceScore;

        if (price <= 5)
            priceScore = 10;
        else if (price <= 7)
            priceScore = 8;
        else
            priceScore = 6;

        return (0.40 * taste)
             + (0.25 * spicy)
             + (0.20 * rating)
             + (0.15 * priceScore);
    }
}

public class PolynomialReduction {

    public static void main(String[] args) {

        Restaurant[] restaurants = {

            new Restaurant("Spice Hub", 9, 10, 6, 9),
            new Restaurant("Food Paradise", 8, 7, 5, 8),
            new Restaurant("Tasty Bites", 9, 8, 7, 9),
            new Restaurant("Royal Kitchen", 7, 5, 4, 8),
            new Restaurant("Andhra Flavours", 10, 10, 6, 10),
            new Restaurant("Urban Eats", 8, 6, 8, 7),
            new Restaurant("Green Garden", 7, 4, 5, 9),
            new Restaurant("Hot Pot", 9, 9, 7, 8)
        };

        // Sort restaurants according to score
        Arrays.sort(restaurants,
                (a, b) -> Double.compare(
                        b.calculateScore(),
                        a.calculateScore()
                ));

        System.out.println("======================================");
        System.out.println("   FOOD RESTAURANT RECOMMENDATION");
        System.out.println("======================================");

        System.out.println("\nRestaurants matching your taste:\n");

        int position = 1;

        for (Restaurant r : restaurants) {

            System.out.println(position + ". " + r.name);
            System.out.println("   Taste   : " + r.taste + "/10");
            System.out.println("   Spicy   : " + r.spicy + "/10");
            System.out.println("   Price   : " + r.price);
            System.out.println("   Rating  : " + r.rating + "/10");
            System.out.printf("   Score   : %.2f%n",
                    r.calculateScore());

            System.out.println();

            position++;
        }
    }
}