package com.timkebut.validasi;


public class PengaturanClassData {

    private String nama;
    private Integer gambar;


    public PengaturanClassData(Integer gambar, String nama) {

        this.gambar = gambar;
        this.nama = nama;

    }

    public Integer getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }




}
