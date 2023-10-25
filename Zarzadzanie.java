import java.util.Scanner;

public class Zarzadzanie {
    Zamowienia zamowienia = new Zamowienia();
    OperacjeKonsoli operacjeKonsoli = new OperacjeKonsoli();
    private int id = 1;
    private int idDeski = 1;
    private int idOpal = 1;

    public void Menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chciałbyś teraz zrobić?");
        System.out.println("1 - Kup drewna dekoracyjne");
        System.out.println("2 - Kup drewno na opał");
        System.out.println("3 - Kup deski");
        System.out.println("4 - Sprawdź cenę swojego dachu");
        System.out.println("9 - Wyświetl zamówienia");
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
                operacjeKonsoli.NacisnijEnter();
            }
            case 2 -> {
                DrewnoNaOpal drewnoNaOpal = new DrewnoNaOpal("Drewno na opał", RodzajDrewna.Dab);
                float koszt_opal = drewnoNaOpal.ObliczKoszt();
                System.out.println("Za " + drewnoNaOpal.getTony() + " ton drewna na opał będziesz musiał zapłacić: " + koszt_opal + " zł.");
                zamowienia.DodajZamowienieNaOpal(idOpal, drewnoNaOpal.getTony(),  koszt_opal);
                idOpal++;
                operacjeKonsoli.NacisnijEnter();
            }
            case 3 -> {
                System.out.println("Podaj długosc desek w metrach: ");
                float dlugosc = scanner.nextFloat();
                System.out.println("Podaj szerokosc desek w metrach: ");
                float szerokosc = scanner.nextFloat();
                System.out.println("Podaj wysokosc desek w metrach: ");
                float wysokosc = scanner.nextFloat();

                cena_m3 cenaM3 = new cena_m3(dlugosc, szerokosc, wysokosc);
                System.out.println("Cena za metr wynosi: " + cenaM3.liczenie_kubikow());
                zamowienia.DodajZamowienieNaDeski(idDeski, cenaM3.getKubiki(), cenaM3.liczenie_kubikow());
                idDeski++;
                operacjeKonsoli.NacisnijEnter();
                break;
            }
            case 4 -> {
                System.out.println("Prosimy o podawanie dlugości w metrach");
                System.out.println("Podaj długosc belki górnej: ");
                float dlugosc_belki = scanner.nextFloat();
                System.out.println("Podaj dlugosc dluzszego boku");
                float dlugosc_bok_a = scanner.nextFloat();
                System.out.println("Podaj dlugosc krotszego boku");
                float dlugosc_bok_b = scanner.nextFloat();
                System.out.println("Podaj dlugosc spadu przy dluzszym boku");
                float dlugosc_spad_a = scanner.nextFloat();
                System.out.println("Podaj dlugosc spadu przy krotszym boku");
                float dlugosc_spad_b = scanner.nextFloat();
                liczenie_pow_dachu liczeniePowDachu = new liczenie_pow_dachu(dlugosc_belki,dlugosc_bok_a,dlugosc_bok_b,dlugosc_spad_a, dlugosc_spad_b);
                System.out.println("Twoj dach:");
                System.out.println("Łączna powierzchnia twojego dachu wynosi: " + liczeniePowDachu.liczenie_pow_ogolnej(dlugosc_belki, dlugosc_bok_a, dlugosc_bok_b));
                System.out.println("Potrzebujesz 2 murłaty o dlugosci: " + liczeniePowDachu.Dlugosc_murlaty_a(dlugosc_bok_a));
                System.out.println("Potrzebujesz 2 murlaty o dlugosci: " + liczeniePowDachu.Dlugosc_murlaty_b(dlugosc_bok_b));
                System.out.println("Potrzebujesz belki gornej o dlugosci: " + liczeniePowDachu.Dlugosc_belki(dlugosc_belki));
                System.out.println("Potrzebujesz : " + liczeniePowDachu.Liczba_kantowek(dlugosc_belki, dlugosc_bok_a, dlugosc_bok_b) + " szt. krokwi");
                operacjeKonsoli.NacisnijEnter();
                break;
            }
            case 9 -> {
                zamowienia.WypiszZamowienia();
                zamowienia.WypiszZamowieniaNaOpal();
                zamowienia.WypiszZamowieniaNaDeski();
                operacjeKonsoli.NacisnijEnter();
                break;
            }
            case 0 -> {
                System.exit(0);
            }
        }
    }
}