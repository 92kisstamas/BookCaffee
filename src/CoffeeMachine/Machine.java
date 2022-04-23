package CoffeeMachine;

public class Machine {
    private int coffePrice;
    private double waterVolume;
    private double coffeeVolume;
    private double waterNeeded;
    private double coffeeNeeded;

    public Machine () {}

    public Machine(int coffePrice, double waterVolume, double coffeeVolume,
                   double waterNeeded, double coffeeNeeded) {
        this.coffePrice = coffePrice;
        this.waterVolume = waterVolume;
        this.coffeeVolume = coffeeVolume;
        this.waterNeeded = waterNeeded;
        this.coffeeNeeded = coffeeNeeded;
    }


    public int availableCoffes () {
        int x = (int) (waterVolume/waterNeeded < coffeeVolume/coffeeNeeded ? waterVolume/waterNeeded
                        : coffeeVolume/coffeeNeeded);
        return x;
    }



    // ---------------------- GET    SET -------------------------------

    public int getCoffePrice() {
        return coffePrice;
    }

    public void setCoffePrice(int coffePrice) {
        this.coffePrice = coffePrice;
    }

    public double getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(double waterVolume) {
        this.waterVolume = waterVolume;
    }

    public double getCoffeeVolume() {
        return coffeeVolume;
    }

    public void setCoffeeVolume(double coffeeVolume) {
        this.coffeeVolume = coffeeVolume;
    }

    public double getWaterNeeded() {
        return waterNeeded;
    }

    public void setWaterNeeded(double waterNeeded) {
        this.waterNeeded = waterNeeded;
    }

    public double getCoffeeNeeded() {
        return coffeeNeeded;
    }

    public void setCoffeeNeeded(double coffeeNeeded) {
        this.coffeeNeeded = coffeeNeeded;
    }
}
