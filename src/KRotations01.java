import java.util.Scanner;

public class KRotations01 {

    static int[] rotation(int[] arr, int k) {
        k %= arr.length;
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[(i + k) % arr.length] = arr[i];
        }
        return rotatedArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int k = sc.nextInt();

        int[] rotatedArr = rotation(arr, k);

        for (int value : rotatedArr) {
            System.out.print(value + " ");
        }
    }
}
