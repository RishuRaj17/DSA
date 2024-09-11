import java.util.Scanner;

public class RecursionGcdBruteForce {

    static int gcd(int x,int y){

        if(y==0){
            return x;
        }

        return gcd(y,x%y) ;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x,y));
    }
}

// EUCLIDS ALGORITHM:
// GCD(X,Y) = GCD(Y,X%Y)
// GCD(X,0) = X
