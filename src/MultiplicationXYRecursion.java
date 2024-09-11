import java.util.Scanner;

public class MultiplicationXYRecursion {

    static int mul(int x, int y){
        if(y==0){
            return 1;
        }
        return x*mul(x,y-1);
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(mul(x,y));
    }
}
