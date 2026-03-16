class Vehicle{
    String brand;
    int speed;

    Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);

    }
}
class Car extends Vehicle{
    String fuelType;

    Car(String brand, int speed, String fuelType){
        super( brand,  speed);
        this.fuelType = fuelType;
    }

    void displayCar(){
        displayVehicle();
        System.out.println("Fuel Type: "+ fuelType);
    }
}
class Practice6{
    public static void main(String args[]){
        Car c = new Car("Mahindra", 1200, "diesel");
        c.displayCar();
    }
}