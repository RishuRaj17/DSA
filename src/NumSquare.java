import java.util.Scanner;

public class NumSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<=6;i++){
            for(int j = i+1;j<=7;j++){
                System.out.print(j);
            }

            for(int k=i;k>0;k-- ){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
