import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число: ");
        double principal = scanner.nextDouble();

        System.out.print("Введите процент: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите количество периодов: ");
        int periods = scanner.nextInt();

        double result = calculateCompoundInterest(principal, interestRate, periods);
        System.out.println("Результат сложного процента: " + result);

        System.out.print("Введите конечное число: ");
        double finalAmount = scanner.nextDouble();

        double reverseInterestRate = calculateReverseInterestRate(principal, finalAmount, periods);
        System.out.println("Процент для достижения конечного числа: " + reverseInterestRate);
    }

    public static double calculateCompoundInterest(double principal, double interestRate, int periods) {
        double rate = 1 + (interestRate / 100); // Вычисляем ставку, добавляя процент к 1
        double result = principal * Math.pow(rate, periods); // Вычисляем сложный процент с помощью формулы: начальное число * (1 + ставка)^количество периодов
        return result;
    }

    public static double calculateReverseInterestRate(double principal, double finalAmount, int periods) {
        double rate = Math.pow(finalAmount / principal, 1.0 / periods) - 1; // Вычисляем ставку, используя обратную формулу: (конечное число / начальное число)^(1 / количество периодов) - 1
        double interestRate = rate * 100; // Преобразуем ставку в проценты
        return interestRate;
    }
