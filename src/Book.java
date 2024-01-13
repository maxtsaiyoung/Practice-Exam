public class Book {

    public int numberOfPages;
    public String genre;
    public boolean hasPictures;

    public Book(int pNumberOfPages,String pGenre,boolean pHasPictures){
        numberOfPages = pNumberOfPages;
        genre = pGenre;
        hasPictures = pHasPictures;
    }


    public void printInfo(){
        System.out.println("This book has "+ numberOfPages + " pages.");
        System.out.println("This book is part of the " + genre + " genre.");
        System.out.println("It is " + hasPictures + " that this book has pictures.");
    }



}
