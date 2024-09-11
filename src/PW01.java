import java.util.Scanner;

public class PW01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = sc.nextInt();

//        if(a%2 == 0 && a%3 == 0){
//            System.out.println("true");
//        }

//        if(a%3==0 | a%5==0){
//            System.out.println("true");
//        }

        int sum = 0;
        int n=1;
        while (n<=a){
            sum += n;
            n++;
        }
        System.out.println(sum);
    }
}
