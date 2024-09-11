import java.util.Scanner;

public class adi01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int a=sc.nextInt();
        int quo= a;
        int ans = 0;
        int i = 1;
        while(quo>0){
            int rem= quo%2;
            ans +=  rem*i;
            quo/=2;
            i*=10;
        }
        System.out.println(ans);
    }
}