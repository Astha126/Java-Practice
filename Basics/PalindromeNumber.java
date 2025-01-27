package Basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        
        int temp = n;
        int rev = 0;
        while(n!=0){
           rev = rev * 10 + (n % 10);
           n = n / 10;
        }
        if(temp ==0){
            System.out.println("Invalid Input!");
        }
        else if(temp == rev){
            System.err.println("It's Palindrom");
        }
        else
        System.err.println("It's not");
    }
}
