import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        int [] arr_1 = arr.clone();
        int [] arr_2 = Arrays.copyOf(arr,arr.length);
        int [] arr_3 = Arrays.copyOfRange(arr,0,arr.length);

        Arrays.sort(arr);
    }
}
