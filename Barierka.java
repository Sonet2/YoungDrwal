import java.util.Scanner;

public class Barierka extends ProduktZDrewna implements ObliczenieKosztow{
    public Barierka(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() throws ZlaWartosc {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc barierki: ");
        float wysokosc = scanner.nextFloat();
        System.out.println("Podaj szerokosc barierki: ");
        float szerokosc = scanner.nextFloat();
        System.out.println("Podaj dlugosc barierki: ");
        float dlugosc = scanner.nextFloat();

        if(dlugosc < 0 || szerokosc < 0 || wysokosc < 0)
        {
            throw new ZlaWartosc("Nie możesz wpisać wartości mniejszych lub równych 0!");
        }

        float m2 = wysokosc * szerokosc * dlugosc;
        float koszt = m2 * 1000;
        return koszt;
    }
}
