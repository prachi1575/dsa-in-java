public class cointoss {
    public static void main(String[] args) {
        int n=3;
        coin(n,"");
    }
    public static void coin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        
        coin(n-1,ans+"T");
        coin(n-1,ans+"H");
    }
}

