public class UniqueNumber {
    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR with each element
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        System.out.println("Unique number is: " + findUnique(arr));
    }
}
