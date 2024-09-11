public class recursionFactorialPwSkills {
    static int fact(int num){

        if(num==1){
            System.out.println(num);
            return num;
        }

       int factorial = num*fact(num-1);
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String[] args) {
        int num = 4;

        fact(num);
    }
}
