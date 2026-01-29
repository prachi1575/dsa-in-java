public class power{
    public static void main(String[] args) {
        int a=5;
        int b=2;
        System.out.println(power(a,b));
    }
    public static int power(int base,int power){
        if(power==0){
            return 1;
        }
        else{
            return base*power(base,power-1);
        }
    }
}