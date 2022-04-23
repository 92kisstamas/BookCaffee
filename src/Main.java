import BooksMusics.Book;
import BooksMusics.models.Author;
import CoffeeMachine.Customer;
import CoffeeMachine.Machine;

public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author("Stephen King", "America", 1947);
        Author authorTwo = new Author("J. K. Rowling", "Anglia", 1965);
        Author authorThree = new Author("J. R. R. Tolkien", "Oranje", 1892);

        Book bookOne = new Book();
        bookOne.setAuthor(authorOne);
        bookOne.setGenre("Novel");
        bookOne.setTitle("Setét torony");
        bookOne.setPublished(1982);

        Book bookTwo = new Book(authorOne, "Carrie", 1974, "Novel");
        Book bookThree = new Book(authorOne, "Christine", 1983, "Novel");
        Book bookFour = new Book(authorOne, "A Ragyogás", 1977, "Novel");

        bookOne.printInfo();
        bookTwo.printInfo();
        bookThree.printInfo();
        bookFour.printInfo();


        Machine machine = new Machine(120, 1500, 500,
                55, 7);

        System.out.println(machine.availableCoffes());

        Customer customer = new Customer("Beri", 300, 2);
        customer.canBuyCaffee(machine);
    }
}
