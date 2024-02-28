package jptv22hometasks;

import java.util.Scanner;

public class Calendar {
    private final Scanner scanner;

    Calendar(Scanner scanner) {
        this.scanner = scanner;
    }
    public void getYearName(){
        System.out.println("\n++++++++++++++++++++++++++");
        System.out.println("+    Восточный календарь    +");
        System.out.println("+++++++++++++++++++++++++++++\n");

        System.out.print("Введите год: ");
        int year = this.scanner.nextInt();scanner.nextLine();

        if(year < 1984){
            System.out.println("Минимальный год: 1984");
            return;
        }

        String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
        String[] animals = {"крыса", "корова", "тигр", "заяц", "дракон", "змея", "лошадь", "овца", "обезьяна", "курица", "собака", "свинья"};

        int subCycle = (year - 1984) % 60;

        int colorIndex = ((year - 1984) / 2) % 5;
        int animalIndex = subCycle % 12;

        String yearName = colors[colorIndex] + " " + animals[animalIndex];

        System.out.println(year + " год - " + yearName);
    }
}