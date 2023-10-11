import java.util.Scanner;

public class Rzezba extends ProduktZDrewna implements ObliczenieKosztow{
    public Rzezba(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc rzezby: ");
        float wysokoscRz = scanner.nextFloat();
        System.out.println("Podaj szerokosc rzezby: ");
        float szerokoscRz = scanner.nextFloat();
        System.out.println("Podaj dlugosc rzezby: ");
        float dlugoscRz = scanner.nextFloat();

        float m2Rz = wysokoscRz * szerokoscRz * dlugoscRz;
        float cenaRz = m2Rz * 3500;
        return cenaRz;
    }
}
