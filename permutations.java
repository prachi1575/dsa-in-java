public class permutations {
    public static void main(String[] args) {
        permutation("abc"," ");
    }
    static void permutation(String n,String ans){
        if(n.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            String left=n.substring(0,i);
            String right=n.substring(i+1);
            permutation(left+right,ans+ch);
        }
    }
}

