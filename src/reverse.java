import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = 0;
        while (num>0){

            int temp = (num%10);

            reverseNum = reverseNum*10 + temp;

            num/=10;

        }
        System.out.println(reverseNum);
    }
}

// 249