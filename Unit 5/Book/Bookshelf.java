/**
 * The Bookshelf class represents a collection of Book objects arranged on a shelf.
 * It allows for adding, retrieving, and checking the presence of books on the shelf.
 * Uses Book class.
 */
public class Bookshelf {

    /** 
     * The maximum number of books that the bookshelf can hold.
     */
    private final int MAX_BOOKS = 25;

    /** 
     * The array representing the books on the shelf.
     */
    private Book[] shelf;

    /** 
     * The index of the last book on the shelf.
     */
    private int lastBookPosition; 
   
    /** 
     * Default constructor that initializes an empty bookshelf.
     */
    public Bookshelf() {
        // Initialize the shelf below
        
        lastBookPosition = -1; // book position of -1 indicates an empty shelf (array with null values only)
    }
   
    /** 
     * Constructor that initializes the bookshelf with an array of Book objects.
     * @param s an array of Book objects to initialize the bookshelf
     */
    public Bookshelf(Book[] s) {

    }
   
    /** 
     * Returns the array representing the bookshelf.
     * @return the array of books on the shelf
     */
    public Book[] getShelf() {
        return null;
    }
   
    /** 
     * Returns the maximum number of books that the bookshelf can hold.
     * @return the maximum number of books on the shelf
     */
    public int getMaxBooks() {
        return 0;
    }
   
    /** 
     * Returns the index of the last book on the shelf.
     * @return the index of the last book on the shelf
     */
    public int getLastBookPosition() {
        return 0;
    }
   
    /** 
     * Checks if the bookshelf is empty.
     * @return true if the bookshelf is empty, false otherwise
     */
    public boolean isEmpty() {
        return false;
    }
   
    /** 
     * Selects a random book from the bookshelf.
     * @return a randomly selected Book from the shelf
     */
    public Book randomBook() {
        return null;
    }
   
    /** 
     * Checks if a specific book exists on the bookshelf.
     * @param b the Book to check for on the shelf
     * @return true if the book exists on the shelf, false otherwise
     */
    public boolean checkBook(Book b) {
        return false;
    }
   
    /** 
     * Adds a book to the shelf if there is space available.
     * @param b the Book to be added to the shelf
     * @return true if the book was added, false if the shelf is full
     */
    public boolean addBook(Book b) {
        return false;
    }
   
    /** 
     * Checks if the bookshelf is full.
     * @return true if the bookshelf is full, false otherwise
     */
    public boolean isFull() {
        return false;
    }
}
