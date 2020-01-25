import java.util.Scanner;

public class Tens {
    // Найти число десятков двухзначного числа

    public static void main(String[] args) {

        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число");
        a = sc.nextInt();
        System.out.println("Число десятков " +a/10);

    }
}
