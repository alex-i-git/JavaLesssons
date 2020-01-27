public class OddSumFrom1To50 {

    // 7. Вывести сумму и количество нечетных числе от 1 до 50

    public static void main(String[] args) {

        int a = 1, c = 1;

        for(int i =0;i<=50;i++){
            a=(i%2!=0)?(a=a+i):(a=a);
            c=(i%2!=0)?(++c):(c=c);
        }
        System.out.println(a+ " " +c);
    }

}
