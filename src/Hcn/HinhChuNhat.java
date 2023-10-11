package Hcn;

public class HinhChuNhat implements HCNInterface{
    double chieudai,chieurong;
    @Override
    public double dientichHCN() {
        return chieudai*chieudai;
    }

    @Override
    public double getChieuDai() {
        return chieudai;
    }

    @Override
    public double getChieuRong() {
        return chieurong;
    }

    @Override
    public void setChieuDai(double cd, double cr) {
    this.chieudai=cd;
    this.chieurong=cr;
    }

    @Override
    public void setDaiRong(double cd, double cr) {

    }

}
