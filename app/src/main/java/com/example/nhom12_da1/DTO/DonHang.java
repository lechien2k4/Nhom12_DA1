package com.example.nhom12_da1.DTO;

public class DonHang {
    private String tenDon ;
    private String sizeGiayDon;
    private String soLuongDon;
    private int giaDon;
    private String hangDon;

    public DonHang() {
    }

    public DonHang(String tenDon, String sizeGiayDon, String soLuongDon, int giaDon, String hangDon) {
        this.tenDon = tenDon;
        this.sizeGiayDon = sizeGiayDon;
        this.soLuongDon = soLuongDon;
        this.giaDon = giaDon;
        this.hangDon = hangDon;
    }

    public String getTenDon() {
        return tenDon;
    }

    public void setTenDon(String tenDon) {
        this.tenDon = tenDon;
    }

    public String getSizeGiayDon() {
        return sizeGiayDon;
    }

    public void setSizeGiayDon(String sizeGiayDon) {
        this.sizeGiayDon = sizeGiayDon;
    }

    public String getSoLuongDon() {
        return soLuongDon;
    }

    public void setSoLuongDon(String soLuongDon) {
        this.soLuongDon = soLuongDon;
    }

    public int getGiaDon() {
        return giaDon;
    }

    public void setGiaDon(int giaDon) {
        this.giaDon = giaDon;
    }

    public String getHangDon() {
        return hangDon;
    }

    public void setHangDon(String hangDon) {
        this.hangDon = hangDon;
    }
}