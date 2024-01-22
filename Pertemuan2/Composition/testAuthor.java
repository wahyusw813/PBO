public class testAuthor {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("Wahyu Satrio Widodo", "222212911@stis.ac.id", 'M');

        // Display the initial state of the Author object
        System.out.println("Initial Author Details:");
        System.out.println(author);

        // Test the getter methods
        System.out.println("\nGetter Methods:");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

        // Test the setter method for email
        author.setEmail("wahyusw813@gmail.com");
        System.out.println("\nAfter Updating Email:");
        System.out.println(author);

        // Display the Author details using the getter methods again
        System.out.println("\nUpdated Author Details:");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}
