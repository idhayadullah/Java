public class arrayreverse{
    public static void main(String[] args){
        int [] num = {10,20,30,40,50};
        int len = num.length;
        for(int i=(len-1);i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
}