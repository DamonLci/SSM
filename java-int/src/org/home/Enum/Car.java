package org.home.Enum;

public enum Car {
    BMW("100W"), Jeep("50W"), Lincoln("75W"), Lamborghini("200W"), MercedesBenz("110W");
    public String price;

    Car(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Car car = Car.Jeep;

        switch (car) {
            case BMW:
                System.out.println(car.getPrice());
                break;
            case Jeep:
                System.out.println(car.getPrice());
                break;
            case Lincoln:
                System.out.println(car.getPrice());
                break;
            case Lamborghini:
                System.out.println(car.getPrice());
                break;
            case MercedesBenz:
                System.out.println(car.getPrice());
                break;
            default:
                System.out.println("0.0");
                break;
        }
    }
}
