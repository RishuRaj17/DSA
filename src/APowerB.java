import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 1;
        for(int i=1;i<=b;i++){
            temp *=a;
        }
        System.out.println(temp);
    }
}
