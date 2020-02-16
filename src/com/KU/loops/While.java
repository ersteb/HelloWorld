package com.KU.loops;

public class While {
    public static void main(String[] args) {

        /* while(warunek)



        */

        int n=2;
        int m=10;
        int power=1;
       /* for(int i=0; i<m; i++) {
            power=power*n;
            System.out.println(power);
        }
        System.out.printf("%d to the power of %d is %d\n", n, m, power);
        */
        int i=0;
        while(i<m){

            power=power*n;
            i=i+1;
            System.out.println(power);

        }
        System.out.printf("%d to the power of %d is %d\n", n, m, power);

    }
}
