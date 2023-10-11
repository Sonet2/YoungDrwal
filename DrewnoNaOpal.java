import java.util.Scanner;

import static java.lang.Math.ceil;

public class DrewnoNaOpal extends ProduktZDrewna implements ObliczenieKosztow {
    public DrewnoNaOpal(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Ile ton drewna chcesz kupic?");
        float tony = skaner.nextFloat();
        float cenazatone = 2000;
        float koszt = cenazatone * tony;
        return koszt;
    }
}
