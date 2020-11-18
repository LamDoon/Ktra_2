package com.example.ktra_2;

public class quangcao {
    private String Ten;
    private String des;
    private int Hinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSdt() {
        return des;
    }

    public void setGia(String des) {
        des = des;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public quangcao(String ten, String des, int hinh){
        Ten = ten;
        des = des;
        Hinh =hinh;



    }
}
