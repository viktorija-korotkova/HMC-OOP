package HW1;

public class HW1 {
    public void testHW1() {
        System.out.println("======== HW1 START ========");

        Invoice invoice1 = new Invoice("1234", "Basic part", 2, 25);
        Invoice invoice2 = new Invoice("1234", "Basic part", 0, 25);
        Invoice invoice3 = new Invoice("1234", "Basic part", 2, 0);

        System.out.println("Invoice 1 amount: " + invoice1.getInvoiceAmount());
        System.out.println("Invoice 2 amount: " + invoice2.getInvoiceAmount());
        System.out.println("Invoice 3 amount: " + invoice3.getInvoiceAmount());

        System.out.println("======== HW1 END ========");
    }

    public void testHW1Bonus() {
        System.out.println("======== HW1 Bonus START ========");

        int fuelEfficiency = 10;
        int fuelAmount = 20;
        int driveDistance = 100;

        Car car1 = new Car(fuelEfficiency);
        System.out.println("Fuel efficiency set: " + car1.getEfficiencyKmPerLitre());
        car1.addFuel(fuelAmount);
        System.out.println("Fuel level set: " + car1.getFuelLevel());
        System.out.println("Drive distance: " + driveDistance);
        car1.drive(driveDistance);
        System.out.println("Resulting fuel level: " + car1.getFuelLevel());

        System.out.println("======== HW1 Bonus END ========");

    }
}
