package com.KU.tablice;

public class Auto {
    private int numOfWheels = 4;

    public int getNumOfWheels() {
        return numOfWheels;
    }   public void setNumOfWheels(int numOfWheels) {
        if (numOfWheels > 0) {
            this.numOfWheels = numOfWheels;
        }
    }


}
