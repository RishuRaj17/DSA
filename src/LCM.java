import java.util.Scanner;

public class LCM {

    static int lcm(int x,int y){
        if(y==0){
            return x;
        }

        return lcm(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b/lcm(a,b));
    }
}
