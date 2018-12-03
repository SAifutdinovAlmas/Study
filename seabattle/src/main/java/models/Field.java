package models;


import java.util.ArrayList;

public class Field {
    Ship ship[];
    ArrayList<Cell> cells = new ArrayList<Cell>();

    private void generateCells(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                Cell cell = new Cell(i, j);
                cells.add(cell);
            }
        }
    }

    public Field() {
        generateCells();
    }

    public ArrayList<Cell> getCells(){
        return cells;
    }

//    public void printField() {
//        int count = 0;
//        for (int i = 0; i < cells.size(); i ++) {
//            if (i / 10 > count) {
//                System.out.println();
//                count = i / 10;
//            }
//            cells.get(i).print();
//        }
//    }
}
