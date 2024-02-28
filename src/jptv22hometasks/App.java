/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите номер задачи из списка");
            System.out.println("0. Выход из программы");
            System.out.println("1. Конвертор температуры");
            System.out.println("2. Парсер чисел");
            System.out.println("3. Календарь");
            System.out.println("4. Тест");
            System.out.println("№ задачи: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                    TemperatureConverter temperatureConvenrter = new TemperatureConverter(scanner);
                    temperatureConvenrter.doConvert();
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParser();
                    break;
                case 3:
                    System.out.println("Выбрана задача 3");
                    Calendar calendar = new Calendar(scanner);
                    calendar.getYearName();
                    break;
                case 4:
                    System.out.println("Выбрана задача 4");
                    Test test = new Test(scanner);
                    test.doTest();
                    break;
                default:
                    System.out.println("Выбирайте номер из списка задач!");
                    break;
            }
        }while(repeat);
    }
    
}