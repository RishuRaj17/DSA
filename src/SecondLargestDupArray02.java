public class SecondLargestDupArray02 {

    static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 6, 9, 5, 8};
        int[] arr_2 = {0, -2, 0, -3, 0, -4};

        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondLargest(arr_2));
    }
}
