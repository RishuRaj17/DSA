public class SumOfNaturalNumberAlternateSign {

    static int printSum(int num){
        if(num==1){
            return 1;
        }

        if(num%2==0){
           return printSum(num-1) - num;
        }
        return printSum(num-1)+num;
    }

    public static void main(String[] args) {
        System.out.println(printSum(10));
    }
}
