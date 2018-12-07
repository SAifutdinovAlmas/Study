package models;

public class Cell {
    boolean hasShud;
    boolean hasShip;
    int coordinationX;
    int coordinationY;


    public Cell(int coordinationX, int coordinationY) {
        this.coordinationX = coordinationX;
        this.coordinationY = coordinationY;
    }

    public void print() {
        if (hasShip) {
            System.out.println("%");
        } else {
            System.out.println("*");
        }
    }


}
