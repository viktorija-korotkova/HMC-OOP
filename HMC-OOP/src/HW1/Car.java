package HW1;

public class Car {
    private double efficiencyKmPerLitre;
    private double fuelLevel;

    public Car(int efficiencyKmPerLitre) {
        this.efficiencyKmPerLitre = efficiencyKmPerLitre;
        this.fuelLevel = 0;
    }

    public void addFuel(int amountInLitres) {
        this.fuelLevel += amountInLitres;
    }

    public void drive(int distanceInKm) {
        double resultingFuelLevel = this.fuelLevel - distanceInKm / this.efficiencyKmPerLitre;

        if (resultingFuelLevel >= 0) {
            this.fuelLevel = resultingFuelLevel;
        } else {
            this.fuelLevel = 0;
            System.out.println("Fuel has ran out - not enough to drive that distance");
        }
    }

    public double getEfficiencyKmPerLitre() {
        return efficiencyKmPerLitre;
    }

    public void setEfficiencyKmPerLitre(double efficiencyKmPerLitre) {
        this.efficiencyKmPerLitre = efficiencyKmPerLitre;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
