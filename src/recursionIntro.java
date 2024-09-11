public class recursionIntro {

    static void increasingOrder(int n){

        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        increasingOrder(n-1);

    }

    public static void main(String[] args) {
        int num = 5;
        increasingOrder(num);
    }
}
