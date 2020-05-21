package org.example;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        BillOperation operation = new BillOperation();
        Data da;
        int index = -1;

        Scanner input = new Scanner(System.in);
        int menu;

        System.out.println("MENU");
        System.out.println("1 - Add data");
        System.out.println("2 - Display all data");
        System.out.println("0 - Exit");
        System.out.print("Enter your menu = ");

        menu = input.nextInt();

        do {

            if (menu == 1) {
                String date;
                int accountnumber;
                int taxinvoicenumber;
                String name;
                String address;
                int meternumber;
                int bacaanmetersekarang;
                int bacaanmeterdahulu;
                double tunggakan;

                System.out.println("  ====== Add data====");
                System.out.print("Enter a date bill = ");
                date = input.next() + input.nextLine();

                System.out.print("Enter a user's account number = ");
                accountnumber = input.nextInt();

                System.out.print("Enter a user's tax invoice number = ");
                taxinvoicenumber = input.nextInt();

                System.out.print("Enter a user name = ");
                name = input.next() + input.nextLine();

                System.out.print("Enter a user's address = ");
                address = input.next() + input.nextLine();

                System.out.print("Enter a user's meter number = ");
                meternumber = input.nextInt();

                System.out.print("Enter bacaan meter sekarang = ");
                bacaanmetersekarang = input.nextInt();

                System.out.print("Enter bacaan meter dahulu = ");
                bacaanmeterdahulu = input.nextInt();

                System.out.print("Enter Tunggakan = ");
                tunggakan = input.nextDouble();

                index = index + 1;
                int jumlahunitkegunaan = operation.calculateJumlahUnitKegunaan(bacaanmetersekarang, bacaanmeterdahulu);
                double cajsemasa = operation.calculateCajSemasa(jumlahunitkegunaan);
                double jumlahbayaranbill = operation.calculateJumlahBayaranBill(cajsemasa, tunggakan);

                da = new Data(date, accountnumber, taxinvoicenumber, name, address, meternumber, bacaanmetersekarang, bacaanmeterdahulu, jumlahunitkegunaan, cajsemasa, tunggakan, jumlahbayaranbill);
                operation.addData(da, index);
            }

            else if (menu == 2)
                operation.displayAllData();
            else if (menu == 0)
                System.exit(0);

            System.out.println("\nMENU");
            System.out.println("1 - add data");
            System.out.println("2 - display data");
            System.out.println("0 - exit");


            System.out.print("Enter your menu = ");
            menu = input.nextInt();
            System.out.println("");

        } while (menu >= 1 && menu <=2);
    }
}
