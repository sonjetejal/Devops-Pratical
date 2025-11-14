interface Car {
    void assemble();
}

class BasicCar implements Car {
    public void assemble() {
        System.out.print("Basic Car");
    }
}

class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }

    public void assemble() {
        this.decoratedCar.assemble();
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" + Sports Car Features");
    }
}

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" + Luxury Car Features");
    }
}

public class Cars {
    public static void main(String[] args) {

        Car s1 = new SportsCar(new BasicCar());
        System.out.print("Sports Car: ");
        s1.assemble();

        System.out.println();

        Car s2 = new SportsCar(new LuxuryCar(new BasicCar()));
        System.out.print("Sports + Luxury Car: ");
        s2.assemble();
    }
}
