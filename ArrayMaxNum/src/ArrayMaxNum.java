public class ArrayMaxNum {

    // Найти максимальное значение массива

    public static void main(String[] args) {
        int[] arr = { 1, 2, 303, 5, 9, 10, 12, 33, 11, 6, 99, 102 };
        int max = 0;
        for (int i = 0;i<arr.length;i++){
            max = (max<arr[i])?(max=arr[i]):(max=max);
        }
        System.out.println(max);
    }
}
