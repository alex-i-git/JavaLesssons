import java.util.Scanner;

public class TwoVarsSumOrNull {

    // 1. Даны две переменные целого типа: A и B. Если их значения не равны,
    // то присвоить каждой переменной сумму этих значений,
    //а если равны, то присвоить переменным нулевые значения.
    //Вывести новые значения переменных A и B.

    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменную A: ");
        a = sc.nextInt();
        System.out.println("Введите переменную B:");
        b = sc.nextInt();
        a = b = (a == b)?(a=b=a+b):(a=b=0);
        System.out.println("A: " +a);
        System.out.println("B: " +b);
    }
}
