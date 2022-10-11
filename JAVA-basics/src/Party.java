import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<String> guests = new ArrayList<String>();

    /** add new guest to guests list */
    public void addGuest(String name){
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
