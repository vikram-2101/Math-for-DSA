jfimport java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();
     System.out.println(isPowerOf2(n));
    }
    static boolean isPowerOf2(int n) {
         if((n & (n-1))==0){
            return true;
         }
         return false;
}
}
