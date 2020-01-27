import java.util.Scanner;

public class PhoneTP {

    //Написать программу, вычисляющую стоимость 10 минутного
    //междугороднего разговора в зависимости от кода города.
    //( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб.
    //Киров(800) - 5.00руб. )

    public static void main(String[] args) {

        double time = 10, cost=0;
        int c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите код города: ");

        c = sc.nextInt();

        switch (c){

            case 905:
                cost = time*4.15;
                break;

            case 194:
                cost = time*1.98;
                break;

            case 491:
                cost = time*2.69;
                break;

            case 800:
                cost = time*5.00;
                break;

             default:

                 cost = 0;
        }

        System.out.println(cost);

    }
}
