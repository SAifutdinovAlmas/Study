package models;

public class Printer {
    private Cell[][] cellsUser1;
    private Cell[][] cellsUser2;

    void setCellsUserAndComputer(Cell[][] cells, boolean isUser1) {
        if (isUser1) {
            this.cellsUser1 = cells;
        } else {
            this.cellsUser2 = cells;
        }
    }

    void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                cellsUser1[i][j].print();
                if (j == 9) {
                    System.out.print("         ");
                    for (int k = 0; k < 10; k ++) {
                        cellsUser2[i][k].print();
                    }
                }
            }
        }


//        int count = 0;
//        for (int i = 0; i < cellsUser1.size(); i++) {
//            if (i / 10 > count) {
//
//                System.out.print("              ");
//                for (int j = 0; j < 10; j++) {
//                    cellsUser2.get(j).print();
//                }
//
//                System.out.println();
//                count = i / 10;
//            }
//            cellsUser1.get(i).print();
//        }
    }
}
