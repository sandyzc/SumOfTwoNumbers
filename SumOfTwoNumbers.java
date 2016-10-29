import java.util.Scanner;
 
public class SumOfTwoNumbers
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to be added:");
        int x = input.nextInt();
        int y = input.nextInt();
        int sum=x-~y-1;//using bitwise operator 
        System.out.println(sum);
    }
}