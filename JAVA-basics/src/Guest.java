public class Guest {
    private String name = "";
    private String surname = "";
    private int age = 0;
    String phoneNumber = "";

    // constructor
    public Guest (String nameValue,String surnameValue, int ageValue, String phoneNumberValue ){
        name = nameValue;
        surname = surnameValue;
        age = ageValue;
        phoneNumber = phoneNumberValue;
    }

    // display guest data in terminal
    public void display () {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
    }
}
