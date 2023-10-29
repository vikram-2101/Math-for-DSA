import java.util.Scanner;

public class NoOfSetBits {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();
    System.out.println(Integer.toBinaryString(n));
 System.out.println(setBits(n));
    }
   public static int setBits(int n) {
    int count =0;
        while(n>0) {
        n-=(n & -n);   // n = n & (n - 1)
        count++;
    }
    return count;
    }
}
