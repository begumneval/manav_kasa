package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan kaç kilo armut aldığı bilgisini isteyen kod bloğu
        System.out.println("Armut kaç kilo?: ");
        double armut = scanner.nextDouble();

        //Kullanıcıdan kaç kilo elma aldığı bilgisini isteyen kod bloğu
        System.out.println("Elma kaç kilo?: ");
        double elma = scanner.nextDouble();

        //Kullanıcıdan kaç kilo domates aldığı bilgisini isteyen kod bloğu
        System.out.println("Domates kaç kilo?: ");
        double domates = scanner.nextDouble();

        //Kullanıcıdan kaç kilo muz aldığı bilgisini isteyen kod bloğu
        System.out.println("Muz kaç kilo?: ");
        double muz = scanner.nextDouble();

        //Kullanıcıdan kaç kilo patlıcan aldığı bilgisini isteyen kod bloğu
        System.out.println("Patlıcan kaç kilo?: ");
        double patlican = scanner.nextDouble();

        //Tutar hesabı yapan ve yazdıran kod bloğu
        double sum = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5 ;
        System.out.println("Toplam Tutar: " + sum + "TL");


    }
}