public class Calculator {

    public int sum(int value1, int value2){
        long testValue = (long)value1+(long)value2;
        if(testValue > Integer.MAX_VALUE){
            throw new RuntimeException("Сумма двух слагаемых больше, чем " +Integer.MAX_VALUE);
        }
        if(testValue < Integer.MIN_VALUE){
            throw new RuntimeException("Сумма двух слагаемых меньше, чем " +Integer.MIN_VALUE);
        }
            return value1 + value2;
    }



}

class App{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println("before exception");
            calculator.sum(-2000000000, -2000000000);
            System.out.println("after exception");
        } catch (RuntimeException ex){
            ex.printStackTrace();
            //System.out.println(ex.getMessage());
        }
        System.out.println("after try catch");
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