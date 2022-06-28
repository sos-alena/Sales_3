package utils;

import java.util.Scanner;
// Валидатор ввода значений
public class Validator {
    // Валидация ввода наименования
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }
    //Моя валидация
    public static int validateQuantityInput(Scanner scanner) {
        try {
            int Quantity = Integer.parseInt(scanner.nextLine().trim());
            if (Quantity < 1) {
                System.out.println("Неверное значение: " + Quantity);
                System.out.println("Введите количество снова: ");
                return validateQuantityInput(scanner);
            }
            return Quantity;
        } catch (Exception exception) {
            System.out.println("Неверное значение: " + exception.getMessage());
            System.out.println("Введите количество снова: ");
            return validateQuantityInput(scanner);
        }
    }
    //Моя валидация
    public static float validatePriceInput(Scanner scanner) {
        try {
            float price = Float.parseFloat((scanner.nextLine().trim()));
            if (price <= 0) {
                System.out.println("Неверное значение: " + price);
                System.out.println("Введите цену снова: ");
                return validatePriceInput(scanner);
            }
            return price;
        } catch (Exception exception) {
            System.out.println("Неверное значение: " + exception.getMessage());
            System.out.println("Введите цену снова: ");
            return validatePriceInput(scanner);
        }
    }

    /* Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество!: ");
        }

        int quantity = scanner.nextInt();


        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;    }

    // Валидация ввода цены
    public static float validatePriceInput(Scanner scanner) {
        while (!scanner.hasNextFloat()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите цену!: ");
        }
        float price = scanner.nextFloat();
        while (price <= 0) {
            System.out.println("Неверное значение! Введите цену: ");
            while (!scanner.hasNextFloat()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите цену!: ");

            }
            price = scanner.nextFloat();
        }
        return price;
    }*/

}