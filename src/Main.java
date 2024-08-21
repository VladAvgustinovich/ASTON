import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Часть 1: Работа с числами
        System.out.print("Введите число 1: ");
        int a = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int b = scanner.nextInt();
        System.out.println(compareNumbers(a, b));
        System.out.println("Сумма чисел равна: " + sumNumbers(a, b));
        System.out.println("Разность чисел равна: " + subNumbers(a, b));
        System.out.println("Произведение чисел равно: " + multNumbers(a, b));
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль невозможно!");
        } else {
            System.out.println("Деление чисел равно: " + divisionNumbers(a, b));
        }

        // Часть 2: Сравнение строк
        scanner.nextLine(); 
        System.out.print("Введите строку 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);

        // Часть 3: Печать четных чисел из массива
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int subNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static int multNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static int divisionNumbers(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Ошибка: деление на ноль невозможно!");
        }
        return num1 / num2;
    }

    public static String compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1 + " > " + num2;
        } else if (num1 < num2) {
            return num1 + " < " + num2;
        } else {
            return num1 + " = " + num2;
        }
    }

    public static void compareStrings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}









