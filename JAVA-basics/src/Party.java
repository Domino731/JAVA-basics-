import java.util.*;

public class Party {
    private final Map<String, Guest> guests = new HashMap<String, Guest>();
    private final Scanner scanner = new Scanner(System.in);

    /** add new guest to guests list */
    public void addGuest(){
        // name
        System.out.println("Enter guest name");
        String name = scanner.nextLine();

        // surname
        System.out.println("Enter guest surname");
        String surname = scanner.nextLine();

        // age
        System.out.println("Enter guest age");
        int age = scanner.nextInt();

        // phone number
        System.out.println("Enter guest age");
        int phoneNumber = scanner.nextInt();

        guests.put(String.valueOf(phoneNumber), new Guest(name, surname,age, String.valueOf(phoneNumber)));
    };

    // display all guests
    public void displayGuests() {
        if(guests.size() == 0){
            System.out.println("You haven't added nobody yet");
        }
        else {
            guests.forEach((key, guest) -> {
                guest.display();
            });
        }

    }

    // find guest by number
    public void findGuestByNumber(){
        int phoneNumber = scanner.nextInt();
        Guest result = guests.get(String.valueOf(phoneNumber));
        if(result != null){
            result.display();
        }
        else {
            System.out.println("Guest not fount");
        }
    }
}
