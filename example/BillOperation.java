package org.example;

import java.util.ArrayList;

public class BillOperation {
    ArrayList<Data> datas = new ArrayList<>();

    public void addData(Data dat, int ind) {
        datas.add(dat);
        System.out.println("==== DATA HAS BEEN SAVED SUCCESSFULLY =======");
    }

    public int calculateJumlahUnitKegunaan(int bacaanmetersekarang, int bacaanmeterdahulu) {
        int jumlahunitkegunaan = 0;

        jumlahunitkegunaan = bacaanmetersekarang - bacaanmeterdahulu;

        return jumlahunitkegunaan;
    }

    public double calculateCajSemasa(int jumlahunitkegunaan) {
        double cajsemasa = 0;

        if (jumlahunitkegunaan >= 1 && jumlahunitkegunaan <= 200) {
            cajsemasa = jumlahunitkegunaan * 0.218;
        } else if (jumlahunitkegunaan >= 201 && jumlahunitkegunaan <= 300) {
            cajsemasa = ((jumlahunitkegunaan - 200) * 0.334) + 43.6;
        } else if (jumlahunitkegunaan >= 301 && jumlahunitkegunaan <= 600) {
            cajsemasa = ((jumlahunitkegunaan - 300) * 0.516) + 77;
        } else if (jumlahunitkegunaan >= 601 && jumlahunitkegunaan <= 900) {
            cajsemasa = ((jumlahunitkegunaan - 300) * 0.546) + 231.8;
        } else if (jumlahunitkegunaan >= 900) {
            cajsemasa = ((jumlahunitkegunaan - 900) * 0.571) + 395.6;
        }

        return cajsemasa;
    }

    public double calculateJumlahBayaranBill(double cajsemasa, double tunggakan) {
        double jumlahbayaranbil = 0;

        jumlahbayaranbil = cajsemasa + tunggakan;

        return jumlahbayaranbil;
    }

    public void displayAllData() {
        System.out.println("========= DISPLAYING DATA ===============");

        for (int i = 0; i<datas.size(); i++) {
            System.out.println("");
            System.out.println("Date = " + datas.get(i).getDate());
            System.out.println("Account No = " + datas.get(i).getAccountNumber());
            System.out.println("Invois No = " + datas.get(i).getTaxInvoiceNumber());
            System.out.println("Name = " + datas.get(i).getName());
            System.out.println("Address = " + datas.get(i).getAddress());
            System.out.println("");
            System.out.println("Meter No = " + datas.get(i).getMeternumber());
            System.out.println("Bacaan meter sekarang = " + datas.get(i).getBacaanMeterSekarang());
            System.out.println("Bacaan meter dahulu = " + datas.get(i).getBacaanMeterDahulu());
            System.out.println("---------------------------");
            System.out.println("Jumlah unit kegunaan = " + datas.get(i).getJumlahUnitKegunaan());
            System.out.println("");
            System.out.println("Tunggakan = " + datas.get(i).getTunggakan());
            System.out.println("Caj semasa = " + datas.get(i).getCajSemasa());
            System.out.println("Jumlah bayaran bil = " + datas.get(i).getJumlahBayaranBil());
            System.out.println("");
            System.out.println("========= DISPLAY DATA END ===============");
        }
    }
}
