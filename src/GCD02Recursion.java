import java.util.Scanner;

public class GCD02Recursion {

    static void GCD(int n, int x,int y){

        if(y%n==0 && x%n==0){
            System.out.println(n);
            return;
        }

        GCD(n-1,x,y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int small = (x<y)?x:y;
        int large = (x>y)?x:y;

        GCD( small, small,large);
    }
}
