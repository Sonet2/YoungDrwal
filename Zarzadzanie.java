import java.util.Scanner;

public class Zarzadzanie {
    Zamowienia zamowienia = new Zamowienia();
    private int id = 1;
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
                for (DrewnoDekoracyjne drewno : DrewnoDekoracyjne.values()) {
                    System.out.println(drewno);
                }


                scanner.nextLine();
                System.out.print("Wybierz typ drewna: ");
                String typ = scanner.nextLine();


                switch(typ) {
                    case "Barierka":
                        Barierka barierka = new Barierka("Barierka", rodzaj);
                        float koszt_barierka = barierka.ObliczKoszt();
                        System.out.println("Za barierkę będziesz musiał zapłacić: " + koszt_barierka + " zł.");
                        zamowienia.DodajZamowienie(id, typ, rodzaj.toString(), koszt_barierka);
                        id++;
                        break;

                    case "ObrazNaDrewnie":
                        ObrazNaDrewnie obraz = new ObrazNaDrewnie("Obraz na drewnie", rodzaj);
                        float koszt_obraz = obraz.ObliczKoszt();
                        System.out.println("Za obraz na drewnie będziesz musiał zapłacić: " + koszt_obraz + " zł.");
                        zamowienia.DodajZamowienie(id, typ, rodzaj.toString(), koszt_obraz);
                        id++;
                        break;
                    case "Rzezba":
                        Rzezba rzezba = new Rzezba("Rzeźba", rodzaj);
                        float koszt_rzezba = rzezba.ObliczKoszt();
                        System.out.println("Za rzeźbę będziesz musiał zapłacić: " + rzezba.ObliczKoszt() + " zł.");
                        zamowienia.DodajZamowienie(id, typ, rodzaj.toString(), koszt_rzezba);
                        id++;
                        break;
                }
            }
            case 2 -> {
                DrewnoNaOpal drewnoNaOpal = new DrewnoNaOpal("Drewno na opał", RodzajDrewna.Dab);
                float koszt_opal = drewnoNaOpal.ObliczKoszt();
                System.out.println("Za " + drewnoNaOpal.getTony() + " ton drewna na opał będziesz musiał zapłacić: " + koszt_opal + " zł.");
                zamowienia.DodajZamowienie(id, "Drewno na opał", RodzajDrewna.Dab.toString(), koszt_opal);
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
