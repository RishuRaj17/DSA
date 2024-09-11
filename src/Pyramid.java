import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i =a-1; i>=0;i--){
            for(int j = i;j>0;j--){
                System.out.print(" ");
            }
            for(int k = b-i*2; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
