import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        while (true) {
            System.out.println("Введите первое число");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            System.out.println("Введите второе число");
            b = scanner.nextInt();
            c = a + b;
            System.out.println("Сумма введенных чисел равняется " + c);
            System.out.println("Попробуйте ввести числа заново");
        }
    }
}