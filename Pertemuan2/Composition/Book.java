public class Book {
    private String name;
    private Author[] authors; // Change to array of Author
    private double price;
    private int qty;

    // Constructor with an array of Author
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // Constructor with an array of Author and quantity
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getter method to return array of authors
    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setter methods
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    // toString method to represent the Book object as a String
    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (Author author : authors) {
            authorsString.append(author).append(", ");
        }
        // Remove the trailing comma and space
        if (authorsString.length() > 0) {
            authorsString.setLength(authorsString.length() - 2);
        }

        return "Book{name='" + name + "', authors={" + authorsString + "}, price=" + price + ", qty=" + qty + '}';
    }

    // Method to get the names of the authors as a string
    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        // Remove the trailing comma and space
        if (authorNames.length() > 0) {
            authorNames.setLength(authorNames.length() - 2);
        }
        return authorNames.toString();
    }
}
