public class Kwadrat {
    public int bok;
    public Kwadrat() {
        this.bok = 1;
    }
    public Kwadrat(int bok) {
        this.bok = bok;
    }
    public Kwadrat(Kwadrat kw2)
    {
        this.bok = kw2.bok;
    }
    public int zwrocBok()
    {
        return this.bok;
    }
    public double pole()
    {
        return (this.bok*this.bok);
    }
}
