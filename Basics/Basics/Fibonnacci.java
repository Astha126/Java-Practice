package Basics;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 =0,n2=1,n3;
        System.err.print(0 + "," + 1);
        for(int i =2; i <=n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
          System.err.print("," + n3 );
        }
    }
}
