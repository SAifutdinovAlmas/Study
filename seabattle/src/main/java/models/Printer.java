package models;

import java.util.ArrayList;

public class Printer {
    private ArrayList<Cell> cellsUser1;
    private ArrayList<Cell> cellsUser2;

    void setCellsUserAndComputer(ArrayList<Cell> cells, boolean isUser1) {
        if (isUser1) {
            this.cellsUser1 = cells;
        } else {
            this.cellsUser2 = cells;
        }
    }

    void print(){
        int count = 0;
        for (int i = 0; i < cellsUser1.size(); i ++) {
            if (i / 10 > count) {
                System.out.println();
                count = i / 10;
            }
            cellsUser1.get(i).print();
        //            System.out.print("          ");
            if (i == 9 ) {
                System.out.print("          ");
            }

            cellsUser2.get(i).print();
        }
    }
}
