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


        // SIMPLE CRUD APP ///////////////////////////////////////////////////////

        // classes
        Party party = new Party();
        Boolean shouldContinue = true;


        System.out.println("Choose option:");

        String[] menuOptions = {"1. Show guests", "2. Add new guest", "3. Show meals", "4. Find by phone number", "5. Exit"};

        while (shouldContinue){
            // show user available options
            for (String option : menuOptions){
                System.out.println(option);
            }

            // holding user choice
            int userChoice = scanner.nextInt();

            // checking whether user have chosen one of options
            switch (userChoice) {
                case 1:
                     party.displayGuests();
                     System.out.println("-----------------");
                     break;
                case 2:
                     party.addGuest();
                     System.out.println("-----------------");
                     break;
                case 3:
//                    shouldContinue = false;
                case 4:
                     party.findGuestByNumber();
                     System.out.println("-----------------");
                      break;
                case 5:
                    shouldContinue = false;
                    break;
            }
        }

    }
}