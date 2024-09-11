public class RecursionFibonacciSeries {

    static int ans =0;
    static int temp =1;

    static void fibbonaci(int num){

        if(num==1){
            System.out.println(ans);
            return;
        }

        fibbonaci(num-1);

        if(num==2){
            System.out.println(temp);
            return;
        }

        int a = ans+temp;
        System.out.println(a);
        ans=temp;
        temp = a;

    }

    public static void main(String[] args) {
        int num = 7;

        fibbonaci(num);
    }
}
