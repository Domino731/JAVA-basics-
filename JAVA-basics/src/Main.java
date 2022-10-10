import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, what's your name?Domino");

        Scanner scanner = new Scanner(System.in);
        // read name from terminal
        String name = scanner.nextLine();

        // ARRAYS - 2 ways to declare
        String[] constUsers = new String[4];
        constUsers[0] = "Norman 1";
        constUsers[1] = "Norman 2";
        constUsers[2] = "Norman 3";
        constUsers[3] = "Norman 4";

        String[] constUsers2 = {"Norman 1", "Norman 2", "Norman 3", "Norman 4"};

        // LIST - something like array above, but u can add more elements
        List<String> usersList = new ArrayList<String>();
        usersList.add("Domino");

        // HASHSET - array with unique elements
        Set<String> meals = new HashSet<String>();
        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Pizza");

        // HASHMAP
        Map<String, String> nameToMeal = new HashMap<String, String>();
        nameToMeal.put("Dominik", "Burger");
        nameToMeal.put("Andrew", "Pizza");

        System.out.println("Hello " + name);
    }
}