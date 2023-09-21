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
public class NumberParser {
    
    private final Scanner scanner;
    
    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void doParser() {
        boolean repeat = true;
        System.out.println();
        System.out.println("++++++++++++++++");
        System.out.println("+ Парсер числа +");
        System.out.println("++++++++++++++++");
        int number = scanner.nextInt();scanner.nextLine();
        
        int edCount=0;
        int decCount=0;
        int sumNumbers=0;
        System.out.printf("В веденном числе:%n");
        System.out.printf("В веденном числе:%d%n", edCount);
        System.out.printf("В веденном числе:%d%n", decCount);
        System.out.printf("В веденном числе:%d%n", sumNumbers);
        System.out.println();
    }
}
