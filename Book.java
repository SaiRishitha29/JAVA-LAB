class Book {
    // Attributes
    private String title;
    private String author;
    private int yearofPublication;

    // Constructor
    public Book(String title, String author, int yearofPublication) {
        this.title = title;
        this.author = author;
        this.yearofPublication = yearofPublication;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearofPublication);
        System.out.println(); // Print a blank line for better readability
    }

    public static void main(String[] args) {
        // Creating two Book objects
        Book book1 = new Book("My Experiments with Truth ", "Mahatma Gandhi", 1898);
        Book book2 = new Book("Azad Hind", "Subhash Chandra Bose", 1849);

        // Displaying the details of the books
        System.out.println("Details of Book 1:");
        book1.displayDetails();

        System.out.println("Details of Book 2:");
        book2.displayDetails();
    }
}