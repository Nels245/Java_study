
// Задание 1. Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;

public class DZ_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        float n = iScanner.nextFloat();

        float Tn = (n / 2) * (n + 1); // Формула для нахождения n-ого по порядку треугольного числа
        System.out.println(Tn);
        iScanner.close();
    }
}