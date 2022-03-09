package LuasVolume;

public class Lingkaran implements MenghitungBidang{
    private double r, phi = Math.PI;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double luas() {
        return luas(this.r);
    }
    public double luas(double r) {
        return phi*r*r;
    }

    @Override
    public double keliling() {
        return keliling(this.r);
    }
    public double keliling(double r) {
        return phi*(2*r);
    }
}
