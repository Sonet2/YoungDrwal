import java.util.Scanner;

public class ObrazNaDrewnie extends ProduktZDrewna implements ObliczenieKosztow{
    public ObrazNaDrewnie(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() throws ZlaWartosc {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc obrazu: ");
        float dlugosc = scanner.nextFloat();
        System.out.println("Podaj szerokosc obrazu: ");
        float szerokosc = scanner.nextFloat();

        if(dlugosc < 0 || szerokosc < 0)
        {
            throw new ZlaWartosc("Nie możesz wpisać wartości mniejszych lub równych 0!");
        }

        float m2 = szerokosc * dlugosc;
        float koszt = m2 * 7000;
        return koszt;
    }
}
