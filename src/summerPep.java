public class summerPep {

    static int printNum(int n,int x){
        if(n==0){
            return 1;
        }

        return x*printNum(n-1,x);
    }

    public static void main(String[] args) {


        int num = 3;
        int x = 3;
        System.out.println(printNum(num,x));
    }
}
