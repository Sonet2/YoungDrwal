import java.util.Scanner;

public class Zarzadzanie {
    public Zarzadzanie()
    {

    }
    public void Menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chciałbyś teraz zrobić?");
        System.out.println("1 - Kup drewna dekoracyjne");
        System.out.println("2 - Kup drewno na opał");
        System.out.println("0 - Wyjdź ze sklepu");

        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1 -> {
                System.out.println("W ofercie mamy następujące typy drewna: ");
                for(RodzajDrewna rodzaj: RodzajDrewna.values())
                {
                    System.out.println(rodzaj);
                }


            }
            case 2 -> {
                DrewnoNaOpal drewnoNaOpal = new DrewnoNaOpal("Drewno na opał", RodzajDrewna.Dab);
                System.out.println(drewnoNaOpal.ObliczKoszt());
            }
            case 0 -> {
                System.exit(0);
            }
        }
    }
}
