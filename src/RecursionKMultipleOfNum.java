public class RecursionKMultipleOfNum {

    static int mul(int num,int k){

//      Method One:
//        if(k==0) return k+1;
//
//        System.out.println(num*mul(num,k-1));
//
//        return k+1;
//
//        Method Two:
        if(k==0) return k;

        int ans = num+mul(num,k-1);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int num = 12;
        int k = 5;

        mul(3,8);
    }
}
