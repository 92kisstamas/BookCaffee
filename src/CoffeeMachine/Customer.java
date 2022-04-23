package CoffeeMachine;

public class Customer {
    private String name;
    private int money;
    private int wantsCoffee;

    public Customer (){}

    public Customer(String name, int money, int wantsCoffee) {
        this.name = name;
        this.money = money;
        this.wantsCoffee = wantsCoffee;
    }


    public void canBuyCaffee (Machine machine){
        if (money >= wantsCoffee * machine.getCoffePrice() && wantsCoffee <= machine.availableCoffes()){
            System.out.println("Megvásárolta a kívánt kávé mennyiséget.");
            machine.setCoffeeVolume(machine.getCoffeeVolume() - (wantsCoffee  * machine.getCoffeeNeeded()));
            machine.setWaterVolume(machine.getWaterVolume() - (wantsCoffee * machine.getWaterNeeded()));
            setMoney(getMoney() - (wantsCoffee * machine.getCoffePrice()));
        } else if (money < wantsCoffee * machine.getCoffePrice()) {
            System.out.println("Nincs elég pénze a szükséges kávémennyiségre.");
        } else if (wantsCoffee > machine.availableCoffes()) {
            System.out.printf("A gép nem tud elég kávét kiadni.");
        }
    }


    //-------------------------------    GET   SET   -------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWantsCoffee() {
        return wantsCoffee;
    }

    public void setWantsCoffee(int wantsCoffee) {
        this.wantsCoffee = wantsCoffee;
    }
}
