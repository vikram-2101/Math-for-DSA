public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4,2,6};  // only valid for double repitions not for more than 2 repitions
        System.out.println(ans(arr));
    }
    static int ans(int[] arr) {
    int unique = 0;
    for(int n : arr ) {
        unique^=n;
    }
    return unique;
    }
}
