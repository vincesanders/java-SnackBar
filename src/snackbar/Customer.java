package snackbar;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        id = maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Methods
    public String addCash(double cash) {
        if (cash > 0) {
            this.cashOnHand += cash;
            return this.name + " cash on hand " + this.cashOnHand;
        }
        return "Please enter a valid amount of cash to add.";
    }

    public String buySnacks(Snack snack, int quantity) {
        double totalCost = snack.getTotalCost(quantity);
        if (totalCost <= this.cashOnHand) {
            this.cashOnHand -= totalCost;
            String result = this.name + " cash on hand " + this.cashOnHand;
            System.out.println(result + "\n" + snack.buySnack(quantity) + "\n");
            return result;
        }

        return "Not enough money.";
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }


}