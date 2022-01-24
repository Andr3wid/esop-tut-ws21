public class OOPIntro {
    public static void main(String[] args) {
        Car car1 = new Car(170, "Audi", "White");
        Car car2 = new Car(170, "Audi", "White");

        car1.driveKm(100);
        car1.driveKm(100);

        car1.setDrivenKm(-1);

        System.out.println("Driven km: " + car1.getDrivenKm());
        System.out.println("Number of car objects created: " + Car.getNumberOfCarObjects());
    }
}
