package models;

import java.util.ArrayList;

public class BattleController {

    public void run() {
        User user1 = new User();
        User user2 = new User();
        Field field1 = new Field();
        Field field2 = new Field();
//        Ship[] ships = new Ship[10];
        Printer printer = new Printer();

        ArrayList<Cell> cellsUser1 = new ArrayList<Cell>();
        cellsUser1 = field1.getCells();
        ArrayList<Cell> cellsUser2 = new ArrayList<Cell>();
        cellsUser2 = field1.getCells();

        printer.setCellsUserAndComputer(cellsUser1, true);
        printer.setCellsUserAndComputer(cellsUser2, false);
        printer.print();

//        for (int i = 0; i < 10; i++) {
//            ships[i] = new Ship();
//        }

    }
}
