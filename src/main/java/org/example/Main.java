package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kilo?: ");
        double armut = scanner.nextDouble();

        System.out.println("Elma kaç kilo?: ");
        double elma = scanner.nextDouble();

        System.out.println("Domates kaç kilo?: ");
        double domates = scanner.nextDouble();

        System.out.println("Muz kaç kilo?: ");
        double muz = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo?: ");
        double patlican = scanner.nextDouble();

        double sum = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5 ;

        System.out.println("Toplam Tutar: " + sum + "TL");


    }
}