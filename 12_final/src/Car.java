public class Car {
    private int topSpeed;
    private int drivenKm;
    private String brand;
    private String color;
    private boolean isSUV;

    private static int numberOfCarObjects = 0;

    Car(int topSpeed, String brand, String color) {
        this.isSUV = false;

        this.topSpeed = topSpeed;
        this.brand = brand;
        this.color = color;
        this.drivenKm = 0;

        numberOfCarObjects++;
    }

    public void driveKm(int km) {
        System.out.println("Driving " + km + "km");
        this.drivenKm = this.drivenKm + km;
    }

    public static int getNumberOfCarObjects() {
        return Car.numberOfCarObjects;
    }

    public void setDrivenKm(int newKm) {
        if(newKm < 0) {
            System.out.println("NO negative numbers allowed!");
        } else {
            this.drivenKm = newKm;
        }
    }

    public int getDrivenKm() {
        return this.drivenKm;
    }
}
