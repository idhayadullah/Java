public class arrayconcad{
    public static void main(String[] args){
        int [] a1 = {10,20,30,40};
        int [] a2 = {50,60,70,80};
        int [] a = new int[a1.length+a2.length];
        for(int i=0;i<a1.length;i++){
            a[i] =  a1[i];
        }
        for(int i=0;i<a2.length;i++){
            a[a1.length+i] =  a2[i];
        }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}