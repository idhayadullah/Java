public class factorial{
    public static void main(String[] args){
        int factorial=1;
        int n = 5;
        for(int i=n;i>0;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}