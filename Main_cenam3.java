import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długosc desek w metrach: ");
        float dlugosc = input.nextFloat();
        System.out.println("Podaj szerokosc desek w metrach: ");
        float szerokosc = input.nextFloat();
        System.out.println("Podaj wysokosc desek w metrach: ");
        float wysokosc = input.nextFloat();


        cena_m3 cenaM3 = new cena_m3(dlugosc, szerokosc, wysokosc);

        System.out.println("Cena za metr wynosi: " + cenaM3.liczenie_kubikow());
    }
}