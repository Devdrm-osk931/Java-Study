package Ch6;

class Car {
    String color;
    String name;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    public Car(String color, String name, int door) {
        this.color = color;
        this.name = name;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", door=" + door +
                '}';
    }
}

public class CarTest2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }

}
