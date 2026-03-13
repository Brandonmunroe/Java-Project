public class Dog extends Animal{
    String name;
    String color;

    public Dog(String name2, String breed, int age, String color2,String name, String color){
        super(name2, breed, age, color2);
        this.name = name;
        this.color = color;
    }
    public static void main(String[] args){
        Dog myDog = new Dog("Ginger", "Shihzu Maltese", 11, "White", "Destiny", "Black");


    }
}
