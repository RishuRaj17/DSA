public class RecursionFactorial {

    static int ans =0;

    static void fact(int num){

        if(num == 1){
            System.out.println(num);
            ans=num;
            return;
        }

        fact(num-1);
        ans *= num;
        System.out.println(ans);


    }

    public static void main(String[] args) {
        int num =5;

        fact(num);
    }
}
