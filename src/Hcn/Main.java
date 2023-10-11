package Hcn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap so HCN can them: ");
        int N = Integer.parseInt(scan.nextLine());

        HinhChuNhat[] hcnList = new HinhChuNhat[N];
        for (int i = 0; i < N; i++) {
            double cd, cr;
            System.out.println("Nhap chieu dai: ");
            cd = Double.parseDouble(scan.nextLine());
            System.out.println("Nhap chieu rong: ");
            cr = Double.parseDouble(scan.nextLine());

            hcnList[i] = new HinhChuNhat();

            hcnList[i].setDaiRong(cd, cr);
        }

        System.out.println("Thong tin HCN: ");
        for (HinhChuNhat hcn : hcnList) {
            System.out.println("Chieu dai: " + hcn.getChieuDai() + ", chieu rong: " +
                    hcn.getChieuRong() + "Dien tich: " + hcn.dientichHCN());
        }

        double max = hcnList[0].dientichHCN();
        int index = 0;

        for (int i = 1; i < N; i++) {
            if(hcnList[i].dientichHCN() > max) {
                max = hcnList[i].dientichHCN();
                index = i;
            }
        }

        HinhChuNhat hcn = hcnList[index];
        System.out.println("Thong tin HCN co dien tich MAX");
        System.out.println("Chieu dai: " + hcn.getChieuDai() + ", chieu rong: " +
                hcn.getChieuRong() + "Dien tich: " + hcn.dientichHCN());
    }

}
