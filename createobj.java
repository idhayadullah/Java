import java.util.Scanner;
public class myclass{
    int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        myclass object = new myclass();
        System.out.println(object.product(a,b));
          
    }
}