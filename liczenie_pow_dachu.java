public class liczenie_pow_dachu {
    public float dlugosc_belki;
    public float dlugosc_bok_a;
    public float dlugosc_bok_b;
    public float dlugosc_spadu_a;
    public float dlugosc_spadu_b;

    public liczenie_pow_dachu(float dlugosc_belki, float dlugosc_bok_a, float dlugosc_bok_b, float dlugosc_spadu_a, float dlugosc_spadu_b)
    {
        this.dlugosc_belki = dlugosc_belki;
        this.dlugosc_bok_a = dlugosc_bok_a;
        this.dlugosc_bok_b = dlugosc_bok_b;
        this.dlugosc_spadu_a = dlugosc_spadu_a;
        this.dlugosc_spadu_b = dlugosc_spadu_b;

    }
    public float liczenie_pow_ogolnej(float dlugosc_belki, float dlugosc_bok_a, float dlugosc_bok_b)
    {
        float pole_trapezu;
        pole_trapezu = (dlugosc_bok_a + dlugosc_belki) * dlugosc_spadu_a /2;
        float wynik_trapezu = pole_trapezu;
        float pole_trojkata;
        pole_trojkata = (dlugosc_bok_b * dlugosc_spadu_b) /2;
        float wynik_trojkat = pole_trojkata;
        float laczna_pow_dachu = wynik_trapezu + wynik_trojkat;
        return laczna_pow_dachu;
    }
    public float Dlugosc_murlaty_a(float dlugosc_bok_a)
    {
        float dlugosc_murlaty_a = this.dlugosc_bok_a;
        return dlugosc_murlaty_a;
    }
    public float Dlugosc_murlaty_b(float dlugosc_bok_b)
    {
        float dlugosc_murlaty_b = this.dlugosc_bok_b;
        return dlugosc_murlaty_b;
    }
    public float Dlugosc_belki(float dlugosc_belki)
    {
        float dlugosc_belki_gornej = this.dlugosc_belki;
        return dlugosc_belki_gornej;
    }
    public float Liczba_kantowek(float dlugosc_belki, float dlugosc_bok_a, float dlugosc_bok_b)
    {
        float pole_trapezu;
        pole_trapezu = ((dlugosc_bok_a + dlugosc_belki) * dlugosc_spadu_a) / 2;
        float wynik_trapezu = pole_trapezu;
        float pole_trojkata;
        pole_trojkata = (dlugosc_bok_b / 2) * dlugosc_spadu_b;
        float wynik_trojkat = pole_trojkata;
        float laczna_pow_dachu = wynik_trapezu + wynik_trojkat;
        float liczba_kantowek = laczna_pow_dachu * 2;
        return liczba_kantowek;
    }
}
