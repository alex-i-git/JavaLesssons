public class Row7 {

    // 5.   Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //       7 14 21 28 35 42 49 56 63 70 77 84 91 98

    public static void main(String[] args) {

        int c = 7;
        for(int i = 0; i<13; i++){
            c = c + 7;
            System.out.print(c+ " ");
        }

    }

}
