package models;

public class BattleController {

    public BattleController() {

    }

    public void run() {
        User user1 = new User();
        User user2 = new User();
        Field field1 = new Field();
        Field field2 = new Field();
        Ship[] ships = new Ship[10];

        for (int i = 0; i < 10; i++) {
            ships[i] = new Ship();
        }
        field1.generateCells();
        field1.printField();
    }
}
