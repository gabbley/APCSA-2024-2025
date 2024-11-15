public class Book {
    // Attributes of the Book class
    private String title;
    private int totalPages;
    private int currentPage;

    // Constructor with parameters
    public Book(String title, int totalPages) {
        this.title = title;
        this.totalPages = totalPages;
        this.currentPage = 0;  // Start at the beginning of the book
    }

    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.totalPages = 100;  // Default number of pages
        this.currentPage = 0;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setCurrentPage(int currentPage) {
        // TODO: Ensure currentPage is within valid range
        
    }

    // Method to read pages from the current page to the end of the book
    public void readPages() {
        // Until you get to the end of the book, print then update currentPage
        // For every page, report "Reading page: #"
        // TODO
        
        
        
        
        // After the loop, print a completed message to the console (below)
        System.out.println("You've finished reading " + title + "!");
    }

    // New method to calculate remaining pages
    public int remainingPages() {
        // TODO
        return 0;
    }

}