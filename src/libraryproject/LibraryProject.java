package libraryproject;

public class LibraryProject {

    public static void main(String[] args) {

        Book ex = new Book("Java How To Program");

        System.out.println("Title: " + ex.getTitle());
        System.out.println("Borrowed?" + ex.isBorrowed());
        ex.borrowed();
        System.out.println("Borrowed?" + ex.isBorrowed());
        ex.returned();
        System.out.println("Borrowed?" + ex.isBorrowed());

        //Library part
        Library firstLibrary = new Library("Moylish Park", "Limerick");
        Library secondLibrary = new Library("clare Street", "Limerick");
        Library thirdLibrary = new Library("Nenagh Road", "Thurles");

        firstLibrary.addBook(new Book("Java How To Program"));
        firstLibrary.addBook(new Book("Whats new in Java 7?"));
        firstLibrary.addBook(new Book("Java in a Nutshell"));
        firstLibrary.addBook(new Book("Pro Android 2"));

        secondLibrary.addBook(new Book("the Power of colour"));
        secondLibrary.addBook(new Book("The Genius of Being"));
        secondLibrary.addBook(new Book("Creativity in Nature"));

        System.out.println("Library hours: ");
        System.out.println();
        Library.printOpenHours();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        thirdLibrary.printAddress();
        System.out.println();
        System.out.println("Borrowing Java How to Program:");

        firstLibrary.borrowBook("Java How To Program");
        firstLibrary.borrowBook("Java How To Program");
        secondLibrary.borrowBook("Java How To Program");
        thirdLibrary.borrowBook("Java How To Program");
        System.out.println();

        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the third library:");
        thirdLibrary.printAvailableBooks();
        System.out.println();

        System.out.println("returning Java How To Program: ");
        firstLibrary.returnBook("Java How To Program");
        System.out.println();

        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }

}
