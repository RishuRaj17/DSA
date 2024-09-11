import java.util.Scanner;

public class FrequencyArray {

    static int [] freq = new int[100000];

    static void setFreq(int [] arr){
        for(int i =0;i< arr.length;i++){
            freq[arr[i]]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,6,5,400,1000,460,500,34};
        setFreq(arr);
        int query = sc.nextInt();

        for(int i=0;i<query;i++){
            System.out.println("Eneter query: ");
            int q = sc.nextInt();
            System.out.println((freq[q]>0)?true:false);
        }

    }
}
