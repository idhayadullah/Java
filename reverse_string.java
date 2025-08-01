public class reversestring{
    public static void main(String[] args){
        String st = "Alphabet";
        int length = st.length();
        String rev = "";
        for(int i=(length-1);i>=0;i--){
           rev = rev+st.charAt(i);
        }
        System.out.println(rev);
    }
}