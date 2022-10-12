import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private final List<String> guests = new ArrayList<String>();
    private final Scanner scanner = new Scanner(System.in);

    /** add new guest to guests list */
    public void addGuest(){
        System.out.println("Enter guest name");
        String name = scanner.nextLine();
        guests.add(name);
    };

    public void displayGuests() {
        if(guests.size() == 0){
            System.out.println("You haven't added nobody yet");
        }
        else {
            for (String guest : guests){
                System.out.println(guest);
            }
        }

    }
}
