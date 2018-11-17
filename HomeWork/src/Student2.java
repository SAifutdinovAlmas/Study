import java.util.Random;
import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] floor = new String[]{"men", "woman"};
        String[] name = new String[]{"Almas", "Danil", "Nikita", "Oleg"};
        String[] surName = new String[]{"Petrov", "Semakov", "Ovechkin", "Petrovn"};
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        String floor1 = floor[random.nextInt(1)];
        String floor2 = floor[random.nextInt(1)];
        String name1 = name[random.nextInt(3)];
        String name2 = name[random.nextInt(3)];
        String surName1 = surName[random.nextInt(3)];
        String surName2 = surName[random.nextInt(3)];
        System.out.println(name1 + " " + surName1 + " " + age1 + " " + floor1);
        System.out.println("");
        System.out.println(name2 + " " + surName2 + " " + age2 + " " + floor2);
    }
}
