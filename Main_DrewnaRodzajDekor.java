public class Main_DrewnaRodzajDekor {
    public static void main(String[] args) {
        System.out.println("Sklep z drewnem");

        RodzajDrewna rodzaj = RodzajDrewna.Sosna;
        DrewnoDekoracyjne drewnienko = DrewnoDekoracyjne.Rzezba;

        System.out.println(rodzaj);

        ZarzadzanieDrewDeko zarzDrewDeko = new ZarzadzanieDrewDeko();

        String drewnoDekoracyjne = String.valueOf(zarzDrewDeko.wybierzDrewnoDekoracyjne());

        System.out.println("Wybrales " + drewnoDekoracyjne);
        System.out.println("Koszt to " + zarzDrewDeko.Oblicz_koszt(drewnoDekoracyjne));






    }
}