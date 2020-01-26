import java.util.Scanner;

public class IfPosAdd1IfNegSub2If0Assign10 {
    // 3. Дано целое число. Если оно является положительным,
    //то прибавить к нему 1; если отрицательным, то вычесть из него 2;
    //если нулевым, то заменить его на 10. Вывести полученное число.

    public static void main(String[] args) {

        int x = 0, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        x = sc.nextInt();

        a = (x==0)?(x=10):((x > 0)?(++x):(x=x-2));

        System.out.println(a);
    }
}
