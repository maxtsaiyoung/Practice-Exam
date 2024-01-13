import org.w3c.dom.ls.LSOutput;

public class Library {

    String nameOfLibrary;
    boolean isOpen;
    int numberOfBooks;
    int randomInt;
    public Book bradfordBook;

    public Book myBook;


    public static void main(String[] args) {
        Library Milton = new Library();
    }

    public Library() {
        System.out.println("Greetings, Bookworms!");
        String nameOfLibrary = "Stacks & Syntax: The Logic Library";
        boolean isOpen = true;
        int numberOfBooks = 15234;
        System.out.println("Welcome to " + nameOfLibrary + ", it is " + isOpen + ", that we are open, we have " + numberOfBooks + " on our shelves.");
        numberOfBooks = 2 * numberOfBooks;
        System.out.println("Welcome to " + nameOfLibrary + ", it is " + isOpen + ", that we are open, we have " + numberOfBooks + " on our shelves.");
        randomBooks();
        authorOfTheDay("Toni Morrison");
        countBooks();
        deweysChoice();


        bradfordBook = new Book(300,"Magical Realism",false);
        bradfordBook.printInfo();

        myBook = new Book(400,"Utopian",false);
        myBook.printInfo();


    }

    public void randomBooks() {
        int randomInt = (int) (Math.random() * 11);
        System.out.println("We spun the wheel and you get to check out " + randomInt + " books from the Library!");
    }


    public void authorOfTheDay(String pAuthor){
        String author = pAuthor;
        System.out.println("Today's feature author is " + author + ".");
    }

    public void countBooks(){
        for(int x=0;x<5;x++){
            System.out.println(x);
        }
       for(int y=3;y<13;y=y+3){
           System.out.println(y);
       }
       for(int z=12;z>=0;z=z-2){
           System.out.print(z + ", ");
       }
    }

    public void deweysChoice(){
        System.out.println();
        double randomNum = (int)(Math.random()*400);
        if(randomNum<100){
            System.out.println("Dewey recommends a general book.");
        }
        if(randomNum>100&&randomNum<199){
            System.out.println("Dewey recommends a book about philosophy.");
        }
        if(randomNum>200&&randomNum<299){
            System.out.println("Dewey recommends a book about religion.");
        }
        if(randomNum>300&&randomNum<399){
            System.out.println("Dewey recommends a book about social science.");
        }

    }

}


