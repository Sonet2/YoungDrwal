import java.util.Scanner;

import static java.lang.Math.ceil;

public class DrewnoNaOpal extends ProduktZDrewna implements ObliczenieKosztow {
    private float tony;
    public DrewnoNaOpal(String nazwa, RodzajDrewna rodzaj) {
        super(nazwa, rodzaj);
    }

    @Override
    public float ObliczKoszt() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Ile ton drewna chcesz kupic?");
        float tony = skaner.nextFloat();
        this.tony = tony;
        float cenazatone = 2000;
        float koszt = cenazatone * tony;
        return koszt;
    }

    public float getTony()
    {
        return this.tony;
    }
}
