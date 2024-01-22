public class testBook {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Wahyu Satrio Widodo", "222212911@stis.ac.id", 'M');
        Author author2 = new Author("Widodo Satrio Wahyu", "222212999@stis.ac.id", 'M');
        
        // Create an array of authors
        Author[] authors = {author1, author2};

        // Create a book with authors
        Book book1 = new Book("Sample Book", authors, 29.99);
        System.out.println("Book 1 details:");
        System.out.println(book1);

        // Create another book with authors and quantity
        Book book2 = new Book("Java Programming", authors, 49.99, 100);
        System.out.println("\nBook 2 details:");
        System.out.println(book2);

        // Test the getter methods
        System.out.println("\nBook 1 author names: " + book1.getAuthorNames());
        System.out.println("Book 1 price: $" + book1.getPrice());
        System.out.println("Book 1 quantity: " + book1.getQty());

        // Test the setter methods
        book1.setPrice(39.99);
        book1.setQty(50);
        System.out.println("\nUpdated Book 1 details:");
        System.out.println(book1);
    }
}
