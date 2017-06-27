package libraryproject;

public class Library extends Address {

    private Book collection[];
    private static String openningHours = "Libraries are open daily from 9am to 5pm.";
    private int collectionCount = 0;

    public Library(String address1, String address2) {
        super(address1, address2);
        collection = new Book[7];
    }

    public static void printOpenHours() {
        System.out.println(openningHours);
    }

    public void addBook(Book book) {

        this.collection[collectionCount] = book;
        collectionCount++;
    }

    public void printAddress() {
        System.out.println(super.getAddress());
    }

    public void printAvailableBooks() {
        if (this.collection[0] == null) {
            System.out.println("No books in catalog");
            return;

        }

        for (int i = 0; i < collectionCount; i++) {

            if (collection[i].isBorrowed() == false) {
                System.out.println(collection[i].getTitle());
            }

        }
    }

    public void borrowBook(String book) {

        if (this.collection[0] == null) {
            System.out.println("Sorry, this book is not in our catalog.");
            return;

        }
        for (int i = 0; i < collectionCount; i++) {

            if (this.collection[i].getTitle().equalsIgnoreCase(book) && (this.collection[i].isBorrowed() == false)) {

                this.collection[i].borrowed();
                System.out.println("You successfully borrowed: " + book);
                return;

            } else if (this.collection[i].getTitle().equalsIgnoreCase(book) && (this.collection[i].isBorrowed() == true)) {
                System.out.println("Sorry, this book is already borrowed.");
                return;
            } else {
                System.out.println("Sorry, this book is not in our catalog.");
                return;
            }

        }
    }

    public void returnBook(String book) {

        for (int i = 0; i < collectionCount; i++) {

            if (this.collection[i].getTitle().equalsIgnoreCase(book)) {

                this.collection[i].returned();
                System.out.println("You successfully returned: " + book);
                return;

            }

        }
    }
}
