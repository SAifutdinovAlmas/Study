import java.util.Random;

public class Student1 {
    Random random = new Random();
    private int age;
    private String[] floorArray = new String[]{"men", "woman"};
    private String floor;
    private String[] nameArray = new String[]{"Almas", "Danil", "Olga", "Masha"};
    private String[] surnameArray = new String[]{"Petrov", "Semakov", "Ovechkina", "Petrovna"};
    private String name;
    private String surname;

    Student1() {
        do {
            this.age = this.random.nextInt(22);
        } while(this.age < 18);

        this.floor = this.floorArray[this.random.nextInt(1)];
        this.name = this.nameArray[this.random.nextInt(3)];
        this.surname = this.surnameArray[this.random.nextInt(3)];
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getFloor() {
        return this.floor;
    }
}
