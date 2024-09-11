import java.util.Scanner;

public class DecimalConversion {
    public static void hmain(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Binary_num = sc.nextInt();
        double decimal=0;
        int n =0;

        while(Binary_num>0){

            int a = Binary_num%10;

            if(n==0 && a ==1){
                decimal+= 1;
            }
            else if(a==1){
                decimal +=  Math.pow(2,n);
            }
            Binary_num = Binary_num/10;
            n++;
        }

        System.out.println(decimal);
    }
}
