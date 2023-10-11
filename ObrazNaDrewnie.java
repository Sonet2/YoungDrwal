import java.util.Scanner;

public class ObrazNaDrewnie extends ProduktZDrewna implements ObliczenieKosztow{
    public ObrazNaDrewnie(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc obrazu: ");
        float dlugoscO = scanner.nextFloat();
        System.out.println("Podaj szerokosc obrazu: ");
        float szerokoscO = scanner.nextFloat();


        float m2O = szerokoscO * dlugoscO;
        float cenaO = m2O * 3000;
        return cenaO;
    }
}
