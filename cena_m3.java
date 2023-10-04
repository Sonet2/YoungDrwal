public class cena_m3 {
    public float dlugosc;
    public float wysokosc;
    public float szerokosc;

    public cena_m3(float dlugosc, float wysokosc, float szerokosc)
    {
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }
    public float liczenie_kubikow()
    {
       float kubiki;
       kubiki = this.dlugosc * this.wysokosc * this.szerokosc;
       int cena_za_kubik = 750;
       float cena = kubiki * cena_za_kubik;
       return cena;
    }
}
