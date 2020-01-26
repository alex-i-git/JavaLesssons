
import java.util.Scanner;

public class MinNumber {

    // 1. Даны три числа. Найти наименьшее из них.

    public static void main(String[] args) {

        double a = 0, b = 0, c = 0, min = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a: ");
        a = sc.nextDouble();
        System.out.println("Введите число b: ");
        b = sc.nextDouble();
        System.out.println("Введите число c: ");
        c = sc.nextDouble();

        min = (a<b)?(min=a):(min=b);
        min = (c<min)?(min=c):(min=min+0);

        System.out.println("Наименьшее число " +min);

    }

}
