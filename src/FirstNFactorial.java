import java.util.Scanner;

public class FirstNFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = 1;
        for(int i=1; i<=num; i++){

            temp *= i;
            System.out.println("Fatorial of "+i+": "+temp);
        }
    }
}
