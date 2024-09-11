import java.util.Scanner;

public class ArmstrongNumber {

    static int count=0;
    static int ans=0;
    static int num;

    static int countDigit(int num){
        if(num!=0){
            count++;
            return countDigit(num/10);
        }
        return count;
    }

    static int findPow(int num, int n){
        if(n==0){
            return 1;
        }

        return num * findPow(num,n-1);
    }

    static int isArmstrong(int num, int n){

        if(num!=0){
            ans += findPow(num%10,n);
            return isArmstrong(num/10,n);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        countDigit(num);

        System.out.println((num==isArmstrong(num,count)?true:false));

    }
}
