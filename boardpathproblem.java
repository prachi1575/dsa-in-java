public class boardpathproblem {
    
    public static void main(String[] args) {
        boardPath(0,3," ");
    }
    static void boardPath(int s,int e,String ans){
        if(s==e){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=6 && s+i<=e;i++){
            boardPath(s+i, e, ans+i);
        }
    }
}

