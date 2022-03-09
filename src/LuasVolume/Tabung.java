package LuasVolume;

public class Tabung extends Lingkaran implements MenghitungRuang{
    double tTabung;

    public Tabung(double r, double tTabung) {
        this.setR(r);
        this.tTabung = tTabung;
    }

    @Override
    public double volume() {
        return volume(this.luas(), this.tTabung);
    }
    public double volume(double luas, double tTabung) {
        return luas*tTabung;
    }

    @Override
    public double luasPermukaan() {
        return LuasPermukaan(this.luas(), this.keliling(), this.tTabung);
    }
    public double LuasPermukaan(double luas, double keliling, double tTabung) {
        return (keliling*tTabung) + (2*luas);
    }
}
