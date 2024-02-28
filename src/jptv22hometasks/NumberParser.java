package jptv22hometasks;

import java.util.Scanner;

public class NumberParser {
    
    private final Scanner scanner;
    
    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void doParser() {
        System.out.println();
        System.out.println("++++++++++++++++");
        System.out.println("+ Парсер числа +");
        System.out.println("++++++++++++++++");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        int edCount = number % 10;
        int decCount = number / 10;
        
        int sumNumbers = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            sumNumbers += tempNumber % 10;
            tempNumber /= 10;
        }
        
        System.out.printf("В введенном числе %d: единиц %d, десятков %d, сумма цифр %d%n", number, edCount, decCount, sumNumbers);
    }
}
