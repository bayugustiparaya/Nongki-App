package com.itsbabay.nongki.model;

public class CafeModel {
    private String namaCafe;
    private String lokasi;
    private String rangeHarga;
    private String jamBuka;
    private int gambar;

    public CafeModel(String namaCafe, String lokasi, String rangeHarga, String jamBuka, int gambar) {
        this.namaCafe = namaCafe;
        this.lokasi = lokasi;
        this.rangeHarga = rangeHarga;
        this.jamBuka = jamBuka;
        this.gambar = gambar;
    }

    public String getNamaCafe() {
        return namaCafe;
    }

    public void setNamaCafe(String namaCafe) {
        this.namaCafe = namaCafe;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getRangeHarga() {
        return rangeHarga;
    }

    public void setRangeHarga(String rangeHarga) {
        this.rangeHarga = rangeHarga;
    }

    public String getJamBuka() {
        return jamBuka;
    }

    public void setJamBuka(String jamBuka) {
        this.jamBuka = jamBuka;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
