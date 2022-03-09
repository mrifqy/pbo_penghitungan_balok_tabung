package LuasVolume;

public class PersegiPanjang implements MenghitungBidang{
    private double p,l;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double luas() {
        return luas(this.p, this.l);
    }
    public double luas(double p, double l) {
        return p*l;
    }

    @Override
    public double keliling() {
        return keliling(this.p, this.l);
    }
    public double keliling(double p, double l) {
        return 2*(p+l);
    }
}
