package snackbar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        id = maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Methods
    public String addQuantity(int quantityToAdd) {
        if (quantityToAdd > 0) {
            this.quantity += quantityToAdd;
            return "Quantity of " + this.name + " is " + this.quantity;
        }
        return "Please enter a valid quantity.";
    }

    public String buySnack(int quantityToBuy) {
        if (quantityToBuy > 0 && quantityToBuy <= this.quantity) {
            this.quantity -= quantityToBuy;
            return "Quantity of " + this.name + " is " + this.quantity;
        }
        return "Not enough money or not enough snacks.";
    }

    public double getTotalCost(int quantityToBuy) {
        if (quantityToBuy > 0 && quantityToBuy <= this.quantity) {
            // I change the price to an int to get rid of any weirdness when working with a double
            // and then convert it back again when returned
            return (double)((int)(this.cost * 100) * quantityToBuy) / 100;
        }
        return 0;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }
}