package com.example.user.resepmasakan;

public class Resepku {
    private String Judulnya, Keterangannya, Proses;
    int Image;
    public Resepku(){}

    public Resepku(String judulnya, int image, String keterangannya, String proses) {
        this.Judulnya = judulnya;
        this.Keterangannya = keterangannya;
        this.Image = image;
        this.Proses = proses;
    }
    public String getJudulnya() {
        return Judulnya;
    }

    public void setJudulnya(String judulnya) {
        this.Judulnya = judulnya;
    }

    public String getKeterangannya() {
        return Keterangannya;
    }

    public void setKeterangannya(String keterangannya) {
        Keterangannya = keterangannya;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getProses() {
        return Proses;
    }

    public void setProses(String proses) {
        Proses = proses;
    }
}