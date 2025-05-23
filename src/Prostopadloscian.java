public class Prostopadloscian extends Kwadrat{
    public double wysokosc;
    double zwrocWysokosc()
    {
        return this.wysokosc;
    }

    public Prostopadloscian(int bok, double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    public Prostopadloscian() {
        bok = 1;
        this.wysokosc = 1;
    }

    public Prostopadloscian(Prostopadloscian p1) {
        bok = p1.bok;
        this.wysokosc = p1.wysokosc;
    }
    public double pole()
    {
        return 2*((bok*bok)+(bok*wysokosc)+(bok*wysokosc));
    }
}
