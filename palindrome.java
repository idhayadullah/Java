public class reverse{
    public static void main(String[] args){
        int n = 122;
        int temp = n;
        int rev = 0;
        while(n!=0){
            int dig = n%10;
            rev = rev * 10 + dig;
            n = n/10;
        }
        if(temp==rev){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
    }
}