import java.util.Scanner;

import static java.lang.Math.ceil;

public class DrewnoNaOpal {
    public void KupDrewnoNaOpal()
    {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Ile ton drewna chcesz kupic?");
        float tony = skaner.nextFloat();
        float cenazatone = 2000;
        float koszt = cenazatone * tony;
        System.out.println("Za " + tony + " tony drewna na opal zaplacisz: " + koszt + " zl");
    }
}
