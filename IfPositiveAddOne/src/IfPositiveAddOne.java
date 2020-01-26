import java.util.Scanner;

public class IfPositiveAddOne {

    // 1. Дано целое число. Если оно является положительным, то прибавить к нему 1;
    //в противном случае не изменять его. Вывести полученное число.

    public static void main(String[] args) {

        int x = 0, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        x = sc.nextInt();

        a = (x > 0)?(++x):(x=x+0);

        System.out.println(a);
    }
}
