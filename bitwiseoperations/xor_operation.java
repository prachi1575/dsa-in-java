public class xor_operation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,3};
        System.out.println(unique(arr));
    }
    public static int unique(int[]arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}
