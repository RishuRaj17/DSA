import java.util.Scanner;

public class PrefixSumQeury {

    static int arr [] = {0,2,4,1,3,6,5};

    static int prefixSumQuery( int l, int r){
        int ans=0;
            ans = arr[r]-arr[l-1];
        return ans;
    }

    static void prefixSum(int arr []){

        for(int i = 2;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter freq: ");
        int query = sc.nextInt();

        prefixSum(arr);

        for(int i =1;i<=query;i++){
            System.out.println("Enter your query: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(prefixSumQuery(l,r));
        }
    }
}
