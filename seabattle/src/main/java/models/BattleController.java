package models;

public class BattleController {

    public void run() {
        User user1 = new User();
        User user2 = new User();
        Field field1 = new Field();
        Field field2 = new Field();
//        Ship[] ships = new Ship[10];
        Printer printer = new Printer();

        Cell[][] cellsUser1 = field1.getCells();

        Cell[][] cellsUser2 = field2.getCells();


        printer.setCellsUserAndComputer(cellsUser1, true);
        printer.setCellsUserAndComputer(cellsUser2, false);
        printer.print();

//        for (int i = 0; i < 10; i++) {
//            ships[i] = new Ship();
//        }

    }
}
