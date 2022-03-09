package LuasVolume;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    double tBalok;

    public Balok(double p, double l, double tBalok) {
        this.setP(p);
        this.setL(l);
        this.tBalok = tBalok;
    }

    @Override
    public double volume() {
        return volume(this.getP(), this.getL(), this.tBalok);
    }
    public double volume(double p, double l, double tBalok) {
        return p*l*tBalok;
    }

    @Override
    public double luasPermukaan() {
        return luasPermukaan(this.getP(), this.getL(), this.tBalok);
    }
    public double luasPermukaan(double p, double l, double tBalok) {
        return 2*((p*l)+(l*tBalok)+(p*tBalok));
    }
}
