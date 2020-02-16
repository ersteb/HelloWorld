package com.KU.tablice2;

public class Point {
    private int x; // współrzędne x //przechowuje 2 wartości int x, int y - współrzędne punktu na powierzchni
    private int y; // współrzędne y
    public void inkrementx() {     //tu tworzysz metodę "inkrementx", void jeśli metoda ma nie zwracać nic
    x++;

    }
    public void inkrementy() {
        y++;
    }

    public void increasex(int z) {
        x = x + z;
    }

    public void increasey(int z) {
        y = y + z;
    }

    public int getX() { //umożliwia zaciągnięcie wartości X w klasie PointB
        return x;
    }

    public int getY() {
        return y;
    }

    public void print() {
        System.out.printf("x: %d, y: %d", x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

