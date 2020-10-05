package snackbar;

private class SnackBar {

    private static void playoutDayOfBusiness() {
        Customer jane = new Customer("Jane", 38.25);
        Customer bob = new Customer("Bob", 29.14);

        VendingMachine drinkMachine = new VendingMachine("Drink Vending Machine");
        VendingMachine snackMachine = new VendingMachine("Snack Vending Machine");

        Snack soda = new Snack("Soda", 21, 0.50, 0);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);
        Snack chocoBar = new Snack("Chocolate Bar", 36, 1.00, 1);

        jane.buySnacks(soda, 1);
        System.out.println();
        jane.buySnacks(pretzel, 1);
        System.out.println();

        bob.buySnacks(soda, 2)
        System.out.println();

        jane.addCash(10.00);
        System.out.println();
        jane.buySnacks(chocoBar, 1);
        System.out.println();

        pretzel.addQuantity(12);
        pretzel.setCost(3.00);
        System.out.println();

        bob.buySnacks(pretzel, 3)

    }

    private static void main(String[] args) {
        playoutDayOfBusiness();
    }
}