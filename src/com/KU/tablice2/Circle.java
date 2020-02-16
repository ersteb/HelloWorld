package com.KU.tablice2;

public class Circle {
    private int r; //deklarujesz pole
    public Circle(int r)
    {        this.r = 8;

    }    double getArea()
    {        return Math.PI * (Math.pow(r, 2));

    }

   // public int getR() {
   //     return r;
   // }

    //^^-to wyszło mi z gettera

    double getPerimeter()
    {        return 2 * Math.PI * r;
    }
}
