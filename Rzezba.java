import java.util.Scanner;

public class Rzezba extends ProduktZDrewna implements ObliczenieKosztow{
    public Rzezba(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() throws ZlaWartosc {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc rzezby: ");
        float wysokosc = scanner.nextFloat();
        System.out.println("Podaj szerokosc rzezby: ");
        float szerokosc = scanner.nextFloat();
        System.out.println("Podaj dlugosc rzezby: ");
        float dlugosc = scanner.nextFloat();

        if(wysokosc < 0 || szerokosc < 0 || dlugosc < 0)
        {
            throw new ZlaWartosc("Nie możesz wpisać wartości mniejszych lub równych 0!");
        }

        float m2 = wysokosc * szerokosc * dlugosc;
        float koszt = m2 * 3500;
        return koszt;
    }
}
