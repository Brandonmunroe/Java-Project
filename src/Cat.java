public class Cat extends Animal{
    String name;
    String color;

    public Cat(String name, String color, String name2, String breed, int age, String color2){
        super(name2, breed, age, color2);
        this.name = name;
        this.color = color;
    }
    public static void main(String[] args){
        Cat myCat = new Cat("Beerus", "MB", "AD", "black", 5, "TM");
        myCat.running();
        myCat.eating();
    }
}

