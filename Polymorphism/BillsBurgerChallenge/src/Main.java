public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke",  1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

        MealOrder reguralMeal = new MealOrder();
        reguralMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        reguralMeal.setDrinkSize("LARGE");
        reguralMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

    }
}
