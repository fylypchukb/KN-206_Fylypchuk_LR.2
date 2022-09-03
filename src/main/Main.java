package main;

import myclass.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Phone> phones = new ArrayList<>();

    public static Phone CreateObject() {
        Phone input = new Phone();
        Scanner scan = new Scanner(System.in);
        System.out.println("id Прізвище Ім'я По батькові Номер рахунку Час міських розмов Час міжміських розмов");
        input.setId(scan.nextInt());
        input.setLName(scan.next());
        input.setFName(scan.next());
        input.setFatherName(scan.next());
        input.setAccountNumber(scan.nextInt());
        input.setDurationWithinCity(scan.nextInt());
        input.setDurationOutCity(scan.nextInt());

        return input;
    }

    public static ArrayList<Phone> CreateArray() {
        System.out.print("Кількість користувачів: ");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();

        ArrayList<Phone> phones = new ArrayList<>();
        for (int i = 0; i < numb; i++) {
            phones.add(CreateObject());
        }

        return phones;
    }

    public static void GetMoreThanInputed() {
        System.out.print("\nЗадайте час міських розмов: ");
        Scanner scan = new Scanner(System.in);
        int asked = scan.nextInt();

        System.out.println("Абоненти, у яких час міських розмов перевищує заданий:");
        for (Phone curr : phones) {
            if (curr.getDurationWithinCity() > asked)
                System.out.println(curr);
        }
    }

    public static void CheckOutCityUsage(){
        System.out.println("\nАбоненти, які користувались міжміським зв'язком: ");
        for (Phone curr: phones) {
            if(curr.getDurationOutCity() > 0)
                System.out.println(curr);
        }
    }

    public static void InRange(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nЗадайте діапазон номера рахунку. Від: ");
        int from = scan.nextInt();
        System.out.print("До: ");
        int to = scan.nextInt();

        for (Phone curr: phones) {
            if(curr.getAccountNumber()>from && curr.getAccountNumber() < to)
                System.out.println(curr);
        }
    }

    public static void main(String[] args) {
        phones = CreateArray();

        GetMoreThanInputed();
        CheckOutCityUsage();
        InRange();
    }
}