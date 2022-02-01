package ClassStructure;

public class User {
    public static int totalOnline = 0;
    public String name;
    public String surname;
    public String email;

    public User(String name, String surname, String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
        totalOnline++;
    }

}
