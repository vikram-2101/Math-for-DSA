import java.util.*;
public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose digit is to be counted ");
        int n= sc.nextInt();
        int b = 10;
        int ans = (int)(Math.log(n)/Math.log(b)+1);
        System.out.println(ans);
    }
}
