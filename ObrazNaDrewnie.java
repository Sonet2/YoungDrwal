import java.util.Scanner;

public class ObrazNaDrewnie extends ProduktZDrewna implements ObliczenieKosztow{
    public ObrazNaDrewnie(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc obrazu: ");
        float wysokoscO = scanner.nextFloat();
        System.out.println("Podaj szerokosc obrazu: ");
        float szerokoscO = scanner.nextFloat();
        System.out.println("Podaj dlugosc obrazu: ");
        float dlugoscO = scanner.nextFloat();

        float m2O = wysokoscO * szerokoscO * dlugoscO;
        float cenaO = m2O * 1500;
        return cenaO;
    }
}
