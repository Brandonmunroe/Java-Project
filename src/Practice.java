
// Online IDE - Code Editor, Compiler, Interpreter

public class Practice
{
    public static void main(String[] args) {
        Cars mercedes = new Cars("Mercedes", "Lightyear", "Blue", "Red");
        Cars toyota = new Cars("Toyota", "Michellin", "Red", "Black");
        Cars subaru = new Cars("Subaru", "Lightyear", "Black", "Red");
        Cars bmw = new Cars ("BMW", "Toyo", "Silver","Brown");
        System.out.println(mercedes.color);
        Animal dog = new Animal("Dog", "Golden Retriever", 4 , "light golden");
        Animal Bird = new Animal("Bird", "Eagle", 2, "Brown-White");
        System.out.println(dog.name2);
        Book bleach = new Book("Bleach", "Tite Kubo", 192);
        System.out.println(bleach.title);
        Console ps5 = new Console("Tekken 8", "PS5 controller");
        System.out.println(ps5.gameDisc);
    }

}
class Animal{
    String name2;
    String breed;
    int age;
    String color2;
    //Constructor - assigning/initialize 
    public Animal(String name2, String breed, int age, String color2){
        this.name2 = name2;
        this.breed = breed;
        this.age = age;
        this.color2 = color2;
    }
    public void eating(){
        System.out.println("Eating");

    }
    public void running(){
        System.out.println("Running");
    }


}


class Cars {
    String name;
    String tires;
    String color;
    String colorOfSeat;

    public Cars(String name, String tires, String color, String colorOfSeat){
        this.name = name;
        this.tires = tires;
        this.color = color;
        this.colorOfSeat = colorOfSeat;
    }
    public void driving(){
        System.out.println("Driving");
    }
    public void start(){
        System.out.println("Start");
    }

}

class Book {
    //Data Members
    String title;
    String authorName;
    int numPages;


    //Constructor initializing
    public Book (String title, String authorName, int numPages){
        this.title = title;
        this.authorName = authorName;
        this.numPages = numPages;
    }

    //Method
    public void read(){
        System.out.println("Reading");
    }

}

class Console{
    //Data Members
    String gameDisc;
    String controller;


    //Constructor
    public Console(String gameDisc, String controller){
        this.gameDisc = gameDisc;
        this.controller = controller;
    }

    //Method
    public void play(){
        System.out.println("Playing");
    }
}

//Write a class called book. What property will the book have?
//Title, Author Name, Number of pages, Glossary
// Function for read a book

//Write a class for a game. What properties will a game have?
//Disc, Controller, Gallery, Library
//Function a game can perform