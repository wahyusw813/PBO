public class Author {
    private String name;
    private String email;
    private char gender;

    // Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to represent the Author object as a String
    @Override
    public String toString() {
        return "Author{name='" + name + "', email='" + email + "', gender=" + gender + '}';
    }
}
