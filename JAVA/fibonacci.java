import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int count = 7, num1 = 0, num2 = 1;
        System.out.print("enter a value");
        Scanner sc=new Scanner(System.in);
        count= sc.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");
        for (int i = 1; i <= count; ++i) {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
