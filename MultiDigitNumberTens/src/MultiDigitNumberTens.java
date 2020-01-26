import java.util.Scanner;

public class MultiDigitNumberTens {

    // Найти число десятков многозначного числа(вторую цифру справа)

    public static void main(String[] args) {

        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите многозначное число от 0 до 2147483647");

        a = sc.nextInt();
        System.out.println("Число десятков " +(a%100)/10);
    }
}
