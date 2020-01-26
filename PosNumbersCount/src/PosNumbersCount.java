import java.util.Scanner;

public class PosNumbersCount {

    // 1. Даны три целых числа. Найти количество положительных чисел
    //в исходном наборе.

    public static int positiveNumCounter (){
        int x = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Введите целое число");
            x = sc.nextInt();
            c = (x>0)?++c:c+0;
            //if(x > 0) {
            //  c++;
            //}

        }
        return c;
    }

    public static void main(String[] args) {

        int a = 0;
        a = positiveNumCounter();
        System.out.println(a);
    }

}
