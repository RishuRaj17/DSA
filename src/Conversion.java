import java.sql.SQLOutput;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimalNum = sc.nextInt();

        int binary =0;
        int i = 1;
        while (decimalNum>0){


            int a = (decimalNum%2);
            int b = a*i;
            binary += b;


            decimalNum = decimalNum/2;
            i *= 10;

        }

        System.out.println(binary);
    }
}

// 1010  0 > 10 > 10 > 1010
