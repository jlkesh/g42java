package lesson7;

public class VarAgr {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 5, 6, 6};
        System.out.println("sum(arr) = " + sum(arr));
        System.out.println("sum2(...) = " + sum2(2, 4, 5, 5, 6, 90));
    }

    static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    static int sum2(int a, int... arr) {
        int result = a;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

}
