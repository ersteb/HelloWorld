package com.KU.loops;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        long i = scanner.nextInt();
        long silnia = 0;
        while (i>0) {
            // sum=sum+1;
            silnia =i*i;
            i--;
        }
        System.out.printf("Sum: %d", silnia);

       */

      /* silnia rozwiązanie 1:


        int n;
        Scanner klaw=new Scanner(System.in);
        System.out.print("n = ");
        n=klaw.nextInt();
        int i=1, s=1;
        while(i<=n){
            s=s*i;
            i++;
        }
        System.out.print(n);
        System.out.print("! = ");
        System.out.println(s);
*/

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int factorial = 1;
        while(i>0){
            factorial *= i;
            i--;

        }
        System.out.printf("Silnia: %d", factorial);

    }
}
