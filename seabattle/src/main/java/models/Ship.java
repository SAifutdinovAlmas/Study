package models;

public class Ship {
    Cell [] cells;
    boolean isDead;
    boolean inJured;

//    public Ship(int sizeShip) {
//        cells = new Cell[sizeShip];
//    }


    public Cell[] getCells() {
        return cells;
    }

    public Ship(int x, int y) {
        cells = new Cell[1];
        cells[0] = new Cell(x,y);
    }
}
