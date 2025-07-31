public class even_num{
    public static void main(String[] args){
        int a = 50;
        int i = 1;
        do{
            if(i%2==0){
                System.out.println(i);
                i++;
            }
        }while(i<a);
    }
}