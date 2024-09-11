public class RecursionCountOfDigit {

    static int countDigit(int num){
        if(num==0){
            return num;
        }
        return countDigit(num/10)+1;
    }

    public static void main(String[] args) {
        int num = 542156;

        System.out.println(countDigit(num));
    }
}
