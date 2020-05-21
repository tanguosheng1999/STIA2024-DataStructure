package org.example;

public class Data {
    private String date;
    private int accountnumber;
    private int taxinvoicenumber;
    private String name;
    private String address;
    private int meternumber;
    private int bacaanmetersekarang;
    private int bacaanmeterdahulu;
    private double jumlahunitkegunaan;
    private double tunggakan;
    private double cajsemasa;
    private double jumlahbayaranbil;

    public Data(String newDate, int newAccountNumber, int newTaxInvoiceNumber, String newName, String newAddress, int newMeterNumber, int newBacaanMeterSekarang, int newBacaanMeterDahulu, double newJumlahUnitKegunaan, double newTunggakan, double newCajSemasa, double newJumlahBayaranBil) {
        date = newDate;
        accountnumber = newAccountNumber;
        taxinvoicenumber = newTaxInvoiceNumber;
        name = newName;
        address = newAddress;
        meternumber = newMeterNumber;
        bacaanmetersekarang = newBacaanMeterSekarang;
        bacaanmeterdahulu = newBacaanMeterDahulu;
        jumlahunitkegunaan = newJumlahUnitKegunaan;
        tunggakan = newTunggakan;
        cajsemasa = newCajSemasa;
        jumlahbayaranbil = newJumlahBayaranBil;
    }

    public String getDate() {
        return date;
    }

    public int getAccountNumber() {
        return accountnumber;
    }

    public int getTaxInvoiceNumber() {
        return taxinvoicenumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMeternumber(){
        return meternumber;
    }

    public int getBacaanMeterSekarang() {
        return bacaanmetersekarang;
    }

    public int getBacaanMeterDahulu() {
        return bacaanmeterdahulu;
    }

    public double getJumlahUnitKegunaan(){
        return jumlahunitkegunaan;
    }

    public double getTunggakan(){
        return tunggakan;
    }

    public double getCajSemasa(){
        return cajsemasa;
    }

    public double getJumlahBayaranBil() {
        return jumlahbayaranbil;
    }

    public void setDate(String newDate) {
        date = newDate;
    }

    public void setAccountNumber(int newAccountNumber) {
        accountnumber = newAccountNumber;
    }

    public void setTaxInvoiceNumber(int newTaxInvoiceNumber) {
        taxinvoicenumber = newTaxInvoiceNumber;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setMeterNumber(int newMeterNumber){
        meternumber = newMeterNumber;
    }

    public void setBacaanMeterSekarang(int newBacaanMeterSekarang) {
        bacaanmetersekarang = newBacaanMeterSekarang;
    }

    public void setBacaanMeterDahulu(int newBacaanMeterDahulu){
        bacaanmeterdahulu = newBacaanMeterDahulu;
    }

    public void setJumlahUnitKegunaan(double newJumlahUnitKegunaan){
        jumlahunitkegunaan = newJumlahUnitKegunaan;
    }

    public void setTunggakan(double newTunggakan){
        tunggakan = newTunggakan;
    }

    public void setCajSemasa(double newCajSemasa){
        cajsemasa = newCajSemasa;
    }

    public void setJumlahBayaranBil(double newJumlahBayaranBil){
        jumlahbayaranbil = newJumlahBayaranBil;
    }
}



