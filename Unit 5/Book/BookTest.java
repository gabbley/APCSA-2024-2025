public class BookTest {

    // Main method to test the Book class
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 5);
        book1.readPages();
        System.out.println("Remaining pages: " + book1.remainingPages());

        Book book2 = new Book();  // Uses the default constructor
        book2.setTitle("Learning OOP");
        book2.setTotalPages(10);
        book2.setCurrentPage(2);
        System.out.println("Current page in " + book2.getTitle() + ": " + book2.getCurrentPage());
        System.out.println("Remaining pages: " + book2.remainingPages());
    }

}