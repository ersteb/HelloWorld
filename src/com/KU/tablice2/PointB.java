package com.KU.tablice2;

public class PointB {

    public static void main(String[] args) {
        Point point = new Point(3,4);
        point.increasex(8); //nowy obiekt
        point.increasey(7); //nowy obiekt tworzysz - zmieniasz wybrana zmienną o dowolną wartość
        point.inkrementx();// zwiększają wybraną współrzędną o 1
        point.print();
    }
}
