public class RecursionPPowerQ {

    static int power(int p, int q){

        if(q==0) return 1;

//        O(q)
//        return p*power(p,q-1);


//        O(log q)
        int smallPow = power(p,q/2);

        if(q%2==0){
            return smallPow * smallPow;
        }

        return p*smallPow*smallPow;
    }

    public static void main(String[] args) {
        int p = 2;
        int q = 5;

        System.out.println(power(p,q));
    }
}
