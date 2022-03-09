package LuasVolume;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double p, l, tBalok, r, tTabung;
        int pil, opsi;
        Scanner in = new Scanner (System.in);
        do {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pil = in.nextInt();
            switch(pil) {
                case 1:
                    System.out.print("Input panjang\t: ");
                    p = in.nextDouble();
                    System.out.print("Input lebar\t\t: ");
                    l = in.nextDouble();
                    System.out.print("Input tinggi\t: ");
                    tBalok = in.nextDouble();
                    Balok balok = new Balok(p,l,tBalok);
                    System.out.println("Luas Persegi Panjang = " + balok.luas());
                    System.out.println("Keliling Persegi Panjang = " + balok.keliling());
                    System.out.println("Volume Balok = " + balok.volume());
                    System.out.println("Luas Permukaan Balok = " + balok.luasPermukaan());

                    break;
                case 2:
                    System.out.print("Input tinggi\t: ");
                    tTabung = in.nextDouble();
                    System.out.print("Input jari-jari\t: ");
                    r = in.nextDouble();
                    Tabung tabung = new Tabung(r, tTabung);
                    System.out.println("Luas Lingkaran = " + tabung.luas());
                    System.out.println("Keliling Lingkaran = " + tabung.keliling());
                    System.out.println("Volume Tabung = " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.luasPermukaan());
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Input yang Anda masukkan salah");
                    break;
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0) ");
            opsi = in.nextInt();
        } while(opsi == 1);
    }
}
