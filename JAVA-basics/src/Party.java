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
        String phoneNumber = scanner.nextLine();
        guests.put(phoneNumber, new Guest(name, surname,age,phoneNumber));
    };

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
}
