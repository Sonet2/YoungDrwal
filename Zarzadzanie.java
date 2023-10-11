import java.util.Scanner;

public class Zarzadzanie {
    Zamowienia zamowienia = new Zamowienia();
    public Zarzadzanie()
    {

    }
    public void Menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chciałbyś teraz zrobić?");
        System.out.println("1 - Kup drewna dekoracyjne");
        System.out.println("2 - Kup drewno na opał");
        System.out.println("3 - Wyświetl zamówienia");
        System.out.println("0 - Wyjdź ze sklepu");

        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1 -> {
                System.out.println("W ofercie mamy następujące rodzaje drewna: ");
                for(RodzajDrewna rodzaj: RodzajDrewna.values())
                {
                    System.out.println(rodzaj);
                }
                System.out.println("Wybierz rodzaj drewna: ");
                RodzajDrewna rodzaj = RodzajDrewna.valueOf(scanner.next());

                System.out.println("W ofercie mamy następujące typy drewna: ");
                System.out.println("Barierka");
                System.out.println("Rzezba");
                System.out.println("ObrazNaDrewnie");


                scanner.nextLine();
                System.out.print("Wybierz typ drewna: ");
                String typ = scanner.nextLine();



                switch(typ) {
                    case "Barierka":
                    {
                        Barierka barierka = new Barierka("Barierka", rodzaj);
                        System.out.println("Za barierkę będziesz musiał zapłacić: " + barierka.ObliczKoszt() + " zł.");
                        zamowienia.DodajZamowienie(typ, rodzaj.toString());
                    }
                    break;
                    case "ObrazNaDrewnie":
                    {
                        ObrazNaDrewnie obraz = new ObrazNaDrewnie("Obraz na drewnie", rodzaj);
                        System.out.println("Za obraz na drewnie będziesz musiał zapłacić: " + obraz.ObliczKoszt() + " zł.");
                        zamowienia.DodajZamowienie(typ, rodzaj.toString());
                    }
                    break;
                    case "Rzezba":
                    {
                        Rzezba rzezba = new Rzezba("Rzeźba", rodzaj);
                        System.out.println("Za barierkę będziesz musiał zapłacić: " + rzezba.ObliczKoszt() + " zł.");
                        zamowienia.DodajZamowienie(typ, rodzaj.toString());
                    }
                    break;
                }




            }
            case 2 -> {
                DrewnoNaOpal drewnoNaOpal = new DrewnoNaOpal("Drewno na opał", RodzajDrewna.Dab);
                System.out.println(drewnoNaOpal.ObliczKoszt());
            }
            case 3 -> {
                zamowienia.WypiszZamowienia();
            }
            case 0 -> {
                System.exit(0);
            }
        }
    }
}
