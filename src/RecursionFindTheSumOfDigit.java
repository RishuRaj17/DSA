public class RecursionFindTheSumOfDigit {

    static int digitSum(int num){

        if(num == 0) return num;

        return num%10 + digitSum(num/10);

    }

    public static void main(String[] args) {
        int num = 510;

        System.out.println(digitSum(num));
    }
}
