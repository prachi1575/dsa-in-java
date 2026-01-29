//2^n-time complexity
public class towerohanoi {
    public static void main(String[] args) {
        change(3,'A','B','C');
    }
    public static void change(int n,char src,char helper,char dest){
        if(n==0)return;
        change(n-1,src,dest,helper);
        System.out.println("Move disk "+n+"from "+src+"to  ,l"+dest);
        change(n-1,helper,src,dest);
    }
}
