package solutions.database._01.src;

public class Account
{
    //# Fields
    private final String username;
    private String password;


    //# Constructors
    public Account(String username, String password) {
        this.username = username;

        this.setPassword(password);
    }


    //# Getter-methods
    public String getUsername() {
        return this.username;
    }


    //# Setter-methods
    void setPassword(String value) {
        this.password = Password.hash(value);
    }


    //# Methods
    boolean verifyPassword(String value) {
        return Password.hash(value).equals(this.password);
    }
}
