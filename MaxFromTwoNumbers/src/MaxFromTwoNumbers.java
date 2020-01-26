import java.util.Scanner;

public class MaxFromTwoNumbers {
    // 3. Даны два числа. Вывести большее из них.
    public static void main(String[] args) {
        double x = 0, a = 0, max = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<2;i++){
            System.out.println("Введите число");
            x = sc.nextDouble();
           a = (max>x)?(max=max+0):(max=x);

        }
        System.out.println(a);
    }
}
