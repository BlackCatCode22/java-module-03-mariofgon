package p1;

public class App {
    public static void main(String[] args) {
        System.out.println("This is the new App Class");

        CoffeeCup coffeeCup = new CoffeeCup();
        coffeeCup.sizeInOz = "24";

        System.out.println("\nThe coffee cup size is " + coffeeCup.sizeInOz);

        Keys myKeys = new Keys();
        myKeys.numOfKeys = 7;
        System.out.println("\nMy keys have " + myKeys.numOfKeys);

        Phone myPhone = new Phone();
        myPhone.typeOfPhone = "iPhone 15";
        System.out.println("\nMy phone is an " + myPhone.typeOfPhone);

    }
}
