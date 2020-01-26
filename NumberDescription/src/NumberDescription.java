import java.util.Scanner;

public class NumberDescription {

    //2.  Дано целое число. Вывести его строку-описание
    //вида «отрицательное четное число», «нулевое число»,
    // «положительное нечетное число» и т. д.

    public static void main(String[] args) {

        String isNull="", isEven="", isPositive="", result;
        int a = 0, x;
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a==0){
            x=0;
        }else if(a>0){
            if(a%2>0){
             x=1;
            }else{
                x=2;
            }
        }else if(a%2>0){
                x=3;
            }else{
                x=4;
            }



        switch(x){
            case 0:
                result = "Ноль";
                break;

            case 1:
                result = "Положительное нечётное число";
                break;
            case 2:
                result = "Положительное чётное число";
                break;
            case 3:
                result = "Отрицательное нечётное число";
                break;

            case 4:
                result = "Отрицательное чётное число";
                break;
            default:
                result = "Нет такого числа";
                break;
        }

        System.out.println(result);

        // так тоже работает
        //isNull = (a == 0)?(isNull="Ноль"):(isNull="число");
        //isEven = (a == 0)?(isEven=""):((a%2 > 0)?(isEven="нечётное"):(isEven="чётное"));
        //isPositive = (a == 0)?(isPositive=""):((a>0)?(isPositive="положительное"):(isPositive="отрицательное"));
        //System.out.println(isPositive+" "+ isEven+" "+ isNull);

    }

}
