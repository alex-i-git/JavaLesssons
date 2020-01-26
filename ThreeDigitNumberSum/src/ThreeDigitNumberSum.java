import java.util.Scanner;

public class ThreeDigitNumberSum {
    // Найти сумму цифр трехзначного числа

    public static void main(String[] args) {
        int x = 0, a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        x = sc.nextInt();
        a = x/100;
        b = (x%100)/10;
        c = x - a*100 - b*10;
        System.out.println("Цифра 1 = " +a+  " ,цифра 2 = " +b+ " ,цифра 3 = " +c+ ". Сумма цифр " +(a+b+c));

    }
}
