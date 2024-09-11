import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = 0;
        while (num>0){

            temp += num%10;

            num = num/10;

        }
        System.out.println(temp);
    }
}
