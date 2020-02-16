package com.KU.tablice2;

public class Kalkulator {

    //public int add(int a, int b){
   //     return a+b;
   // }

    public int add(int...nums){
        int sum=0;
        for (int i = 0; i<nums.length; i++) { //można alternatywnie wykorzystać pętlę for each
            // najeżdzasz na for i wybierasz opcję enhanced for
            sum = sum + nums[i];
        }
        return sum;
    }

    public double add(double a, double b){
        return a+b;
    }
}
