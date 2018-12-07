package models;


import javafx.util.Pair;

import java.util.HashSet;
import java.util.Random;

public class Field {
    Ship ships[] = new Ship[10];
    Cell[][] cells = new Cell[10][10];


    //cells[5][8] = ship

    private void generateCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    void setShip() {
        Random random = new Random();
        HashSet<Pair<Integer, Integer>> coordinats = new HashSet();
        for (int i = 0; i > 0; i++) {
            int x = random.nextInt(9);
            int y = random.nextInt(9);
            coordinats.add(new Pair(x, y));
            if (coordinats.size() == 10) {
                break;
            }
        }
        int i = 0;
        for (Pair<Integer, Integer> coordinat :
                coordinats) {
            ships[i] = new Ship(coordinat.getKey(), coordinat.getValue());
        }

    }


    public Field() {
        generateCells();
        setShip();
    }

    public Cell[][] getCells() {
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
