//divide and conquer
//time complexity: O(n log n)
public class mergesort {
    public static void main(String[] args) {
        int[]arr={38,27,43,3,9,82,10};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void mergeSort(int []arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[]arr,int l,int m,int r){
        int[]temp=new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int t=0;t<temp.length;t++){
            arr[l+t]=temp[t];
        }
    }
}
