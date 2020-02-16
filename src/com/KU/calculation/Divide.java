package com.KU.calculation;

public class Divide {

    public static void main(String[] args) {
        int a = 17;
        int b = 1;

       double c = a / (float) b;

        float d = a / 5.f;
        double e = 4.55 * 5.111;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e + " całkowita " +(int)e);

        double root=Math.sqrt(9);
        double root2=Math.ceil(9.75);
        double root3=Math.min(9.75, 19);
        System.out.println(root);
        System.out.println(root2);
        System.out.println(root3);
    }
}
