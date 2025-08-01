public class pattern_star{
    public static void main(String[] args){
        int row = 2;
        for(int i=row;i>=0;i--){
            System.out.print("    ");
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}