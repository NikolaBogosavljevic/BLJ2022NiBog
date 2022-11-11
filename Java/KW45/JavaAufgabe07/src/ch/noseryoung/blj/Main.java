package ch.noseryoung.blj;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x,number, y=0,temp=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        number=s.nextInt();
        temp =number;
        while(number>0)
        {
            x=number%10;
            number=number/10;
            y=y*10+x;
        }
        if(temp==y)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not Palindrome");
        }
    }
}
