public class recursionFibonaccci {

//    This Code is not for fibbonaci it is for prefix Sum problem

    static int ans;

    static void fibonacci(int num){

        if(num == 1){
            System.out.println(num);
            ans =num;
            return;
        }
        fibonacci(num-1);
        ans +=num;
        System.out.println(ans);

    }
    public static void main(String[] args) {
        int num = 5;

        fibonacci(num);
    }
}
