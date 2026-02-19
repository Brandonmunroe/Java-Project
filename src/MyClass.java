public class MyClass {
    public static void main(String[] args){
        Car myCar = new Car("Mercedes", "Michellin", "Blue", "Black");
        myCar.driving();

    }

}

class Car {
    String name;
    String tires;
    String color;
    String colorOfSeat;

    public Car(String name, String tires, String color, String colorOfSeat){
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
