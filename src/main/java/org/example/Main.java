package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ürünlerin kilogram fiyatları
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5;

        //Kullanıcıdan kaç kilo armut aldığı bilgisini isteyen kod bloğu
        System.out.println("Armut kaç kilo?: ");
        double armutAmount = scanner.nextDouble();

        //Kullanıcıdan kaç kilo elma aldığı bilgisini isteyen kod bloğu
        System.out.println("Elma kaç kilo?: ");
        double elmaAmount = scanner.nextDouble();

        //Kullanıcıdan kaç kilo domates aldığı bilgisini isteyen kod bloğu
        System.out.println("Domates kaç kilo?: ");
        double domatesAmount = scanner.nextDouble();

        //Kullanıcıdan kaç kilo muz aldığı bilgisini isteyen kod bloğu
        System.out.println("Muz kaç kilo?: ");
        double muzAmount = scanner.nextDouble();

        //Kullanıcıdan kaç kilo patlıcan aldığı bilgisini isteyen kod bloğu
        System.out.println("Patlıcan kaç kilo?: ");
        double patlicanAmount = scanner.nextDouble();

        //Tutar hesabı yapan ve yazdıran kod bloğu
        double sum = armutAmount*armut + elmaAmount*elma + domatesAmount*domates + muzAmount*muz + patlicanAmount*patlican ;
        System.out.println("Toplam Tutar: " + sum + " TL");

    }
}