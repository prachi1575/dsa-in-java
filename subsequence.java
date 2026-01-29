//O(2^n)-time complexity of subsequence
public class subsequence{
    public static void main(String[] args) {
        String a="prachi";
        subsequence(a,"");

    }
    public static void subsequence(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        String ros=s.substring(1);
        
        subsequence(ros, ans);
        subsequence(ros, ans+ch);
    }
}
