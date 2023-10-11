import java.util.Scanner;
public class Main_dachy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prosimy o podawanie dlugości w metrach");
        System.out.println("Podaj długosc belki górnej: ");
        float dlugosc_belki = input.nextFloat();
        System.out.println("Podaj dlugosc dluzszego boku");
        float dlugosc_bok_a = input.nextFloat();
        System.out.println("Podaj dlugosc krotszego boku");
        float dlugosc_bok_b = input.nextFloat();
        System.out.println("Podaj dlugosc spadu przy dluzszym boku");
        float dlugosc_spad_a = input.nextFloat();
        System.out.println("Podaj dlugosc spadu przy krotszym boku");
        float dlugosc_spad_b = input.nextFloat();

        liczenie_pow_dachu liczeniePowDachu = new liczenie_pow_dachu(dlugosc_belki,dlugosc_bok_a,dlugosc_bok_b,dlugosc_spad_a, dlugosc_spad_b);

        System.out.println("Twoj dach:");
        System.out.println("Łączna powierzchnia twojego dachu wynosi: " + liczeniePowDachu.liczenie_pow_ogolnej(dlugosc_belki, dlugosc_bok_a, dlugosc_bok_b));
        System.out.println("Potrzebujesz 2 murłaty o dlugosci: " + liczeniePowDachu.Dlugosc_murlaty_a(dlugosc_bok_a));
        System.out.println("Potrzebujesz 2 murlaty o dlugosci: " + liczeniePowDachu.Dlugosc_murlaty_b(dlugosc_bok_b));
        System.out.println("Potrzebujesz belki gornej o dlugosci: " + liczeniePowDachu.Dlugosc_belki(dlugosc_belki));
        System.out.println("Potrzebujesz : " + liczeniePowDachu.Liczba_kantowek(dlugosc_belki, dlugosc_bok_a, dlugosc_bok_b) + " szt. krokwi");

    }
}