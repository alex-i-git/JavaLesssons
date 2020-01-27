public class EvenFrom1To100 {

    // 6. Вывести сумму четных чисел последовательности от 1 до 100

    public static void main(String[] args) {

        int a = 0;

        for(int i =0;i<=100;i++){
            a=(i%2==0)?(a=a+i):(a=a);
        }
        System.out.println(a);
    }
}
