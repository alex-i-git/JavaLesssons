import java.util.Scanner;

// 2. Даны три целых числа. Найти количество положительных и
//количество отрицательных чисел в исходном наборе.

public class PosNegNumbersCount {

        public static void main(String[] args) {

        int x = 0, p = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Введите целое число");
            x = sc.nextInt();

            if(x > 0) {
                p++;
            }else if(x<0){
                n++;
            }

        }

        System.out.println("Положительных чисел " +p+ ", отрицательных чисел " +n+ ".");
    }

}
