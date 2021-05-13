package coffeeMachine;

import java.util.Scanner;

public class Machine {

    static int waterInMachine = 400;
    static int milkInMachine = 540;
    static int coffeeInMachine = 120;
    static int cupsInMachine = 9;
    static int moneyInMachine = 550;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            action();
        }
    }

    public static void action() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String inputAction = scanner.next();

        switch (inputAction) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "exit":
                System.exit(0);
                break;
            case "remaining":
                remainder();
        }

    }

    public static void buy() {
        System.out.println(" ");
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String inputNameOfCoffee = scanner.next();
        switch (inputNameOfCoffee) {
            case "1":
                // make of espresso
                if (waterInMachine < 250) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (coffeeInMachine < 16) {
                    System.out.println("Sorry, not enough coffee!\n");
                } else if (cupsInMachine < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else {
                    waterInMachine -= 250;
                    coffeeInMachine -= 16;
                    cupsInMachine -= 1;
                    moneyInMachine += 4;
                    System.out.println("I have enough resources, making you a coffee!\n");


                }
                break;
            case "2":
                // make of latte
                if (waterInMachine < 350) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (milkInMachine < 75) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (coffeeInMachine < 20) {
                    System.out.println("Sorry, not enough coffee!\n");
                } else if (cupsInMachine < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else {
                    waterInMachine -= 350;
                    milkInMachine -= 75;
                    coffeeInMachine -= 20;
                    cupsInMachine -= 1;
                    moneyInMachine += 7;
                    System.out.println("I have enough resources, making you a coffee!\n");


                }
                break;
            case "3":
                // make of cappuccino
                if (waterInMachine < 200) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (milkInMachine < 100) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (coffeeInMachine < 12) {
                    System.out.println("Sorry, not enough coffee!\n");
                } else if (cupsInMachine < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else {
                    waterInMachine -= 200;
                    milkInMachine -= 100;
                    coffeeInMachine -= 12;
                    cupsInMachine -= 1;
                    moneyInMachine += 6;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                break;
            case "back":
                break;


        }

    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        waterInMachine += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milkInMachine += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeInMachine += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cupsInMachine += scanner.nextInt();


    }

    public static void take() {
        System.out.println("I gave you $" + moneyInMachine);
        moneyInMachine -= moneyInMachine;


    }

    public static void remainder() {
        System.out.println(" ");
        System.out.println("The coffee machine has: \n" + waterInMachine + " of water\n"
                + milkInMachine + " of milk\n"
                + coffeeInMachine + " of coffee beans\n"
                + cupsInMachine + " of of disposable cups\n"
                + moneyInMachine + " of money\n");


    }

}


