public class Calculator {

    public int sum(int value1, int value2){
        long testValue = (long)value1+(long)value2;
        if(testValue > Integer.MAX_VALUE && testValue< Integer.MIN_VALUE){
            throw new RuntimeException("Сумма двух слагаемых больше, чем " +Integer.MAX_VALUE);
        }
            return value1 + value2;
    }



}

class App{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(2000000000, 2000000000);
    }
}

/*class Test{
    public static void main(String[] args) {
        Test.method1();
    }

    public static void method1(){

        Test.method1();
    }
}

 */