package assign1;
/**
 * Anthony Tortola
 * Date: Nov 1st 2019
 */
import java.util.Scanner;

public class palindromeTester
{
    public static void main(String[] args)
    {
        String i1, i2, i3, i4;

        Scanner sn = new Scanner(System.in);
        //Prompts user to input there first string
        System.out.println("Please input your first string:");
        //scans for the first string
        i1 = sn.nextLine();
        //Prompts user to input there second string
        System.out.println("Please input your second string:");
        //scans for the second string
        i2 = sn.nextLine();
        //Prompts user to input there third string
        System.out.println("Please enter your third string:");
        //scans for the third string
        i3 = sn.nextLine();
        //Prompts user to input there fourth string
        System.out.println("Please enter your fourth string:");
        //scans for the fourth string
        i4 = sn.nextLine();

        palindrome w1 = new palindrome(i1);
        palindrome w2 = new palindrome(i2);
        palindrome w3 = new palindrome(i3);
        palindrome w4 = new palindrome(i4);

        //Prints out the string entered along with the type
        System.out.println(w1.checkType());
        System.out.println(w2.checkType());
        System.out.println(w3.checkType());
        System.out.println(w4.checkType());
    }
}