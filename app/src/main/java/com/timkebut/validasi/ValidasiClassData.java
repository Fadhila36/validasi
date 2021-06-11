package com.timkebut.validasi;

public class ValidasiClassData {

    private String id;
    private String nama;
    private String brand;
    private Integer gambar;
    private String deskripsi;
    private String[] detail;


    ValidasiClassData (String id, String nama, String brand, Integer gambar, String deskripsi, String[] detail) {

        super();
        this.id = id;
        this.nama = nama;
        this.brand = brand;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
        this.detail = detail;

    }

    public String getId() {

        return id;
    }

    public String getNama() {

        return nama;
    }

    public String getBrand() {

        return brand;
    }

    public Integer getGambar() {

        return gambar;
    }

    public String getDeskripsi() {

        return deskripsi;
    }

    public String[] getDetail() {

        return detail;
    }


}
