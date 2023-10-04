import java.util.Scanner;

public class ZarzadzanieDrewDeko {
    Scanner scanner = new Scanner(System.in);
    public DrewnoDekoracyjne wybierzDrewnoDekoracyjne()
    {
        System.out.println("Mamy w ofercie: ");
        for (DrewnoDekoracyjne drewno : DrewnoDekoracyjne.values()) {
            System.out.println(drewno);
        }
        DrewnoDekoracyjne drewno = DrewnoDekoracyjne.Barierka;

        String drewnoStr = scanner.nextLine();
        switch(drewnoStr)
        {
            case "Rzezba":
                drewno = DrewnoDekoracyjne.Rzezba;
                return drewno;
            case "Barierka":
                drewno = DrewnoDekoracyjne.Barierka;
                return drewno;
            case "ObrazNaDrewnie":
                drewno = DrewnoDekoracyjne.Barierka;
                return drewno;
        }
        return DrewnoDekoracyjne.Barierka;
    }

    public float Oblicz_koszt(String wybor)
    {
        switch (wybor)
        {
            case "Barierka":
                System.out.println("Podaj wysokosc barierki: ");
                float wysokosc = scanner.nextFloat();
                System.out.println("Podaj szerokosc barierki: ");
                float szerokosc = scanner.nextFloat();
                System.out.println("Podaj dlugosc barierki: ");
                float dlugosc = scanner.nextFloat();

                float m2 = wysokosc * szerokosc * dlugosc;
                float cena = m2 * 1000;
                return cena;
            case "Rzezba":
                System.out.println("Podaj wysokosc rzezby: ");
                float wysokoscRz = scanner.nextFloat();
                System.out.println("Podaj szerokosc rzezby: ");
                float szerokoscRz = scanner.nextFloat();
                System.out.println("Podaj dlugosc rzezby: ");
                float dlugoscRz = scanner.nextFloat();

                float m2Rz = wysokoscRz * szerokoscRz * dlugoscRz;
                float cenaRz = m2Rz * 3500;
                return cenaRz;
            case "ObrazNaDrewnie":
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
        return 0;

    }


}
