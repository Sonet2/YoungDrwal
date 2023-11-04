import java.io.*;
import java.util.ArrayList;

public class Zamowienia{
    private ArrayList<Zamowienie> listaZamowien = new ArrayList<>();
    private ArrayList<ZamowienieNaOpal> listaNaOpal = new ArrayList<>();
    private ArrayList<ZamowienieDeski> listazamMetrow = new ArrayList<>();
    private int id;

    private int idDeski;
    private int idOpal;

    public void DodajZamowienie(int id, String typDrewna, String rodzajDrewna, float koszt)
    {
        listaZamowien.add(new Zamowienie(id, typDrewna, rodzajDrewna, koszt));
    }

    public void DodajZamowienieNaDeski(int idDeski, float m3, float koszt)
    {
        listazamMetrow.add(new ZamowienieDeski(idDeski, m3, koszt));

    }

    public void DodajZamowienieNaOpal(int idOpal, float m3, float koszt)
    {
        listaNaOpal.add(new ZamowienieNaOpal(idOpal, m3, koszt));
    }

    public void WypiszZamowienia()
    {
        for(Zamowienie zamowienie: listaZamowien)
        {
            System.out.println("Zamówienie na drewna dekoracyjne nr: " + zamowienie.getId() + " na: " + zamowienie.getTyp() + " o rodzaju: " + zamowienie.getRodzaj() + " koszt: " + zamowienie.getKoszt() + " zł.");
        }
    }


    public void WypiszZamowieniaNaOpal()
    {
        for(ZamowienieNaOpal zamowienie: listaNaOpal)
        {
            System.out.println("Zamówienie na drewna na opał nr: " + zamowienie.getId() + " na " + zamowienie.getTony() + " ton drewna" + " o koszcie: " + zamowienie.getKoszt() + " zł.");
        }
    }

    public void WypiszZamowieniaNaDeski()
    {
        for(ZamowienieDeski zamowienie: listazamMetrow)
        {
            System.out.println("Zamówienie na deski nr: " + zamowienie.getId() + " na : " + zamowienie.getM3() + "m3 desek koszt: " + zamowienie.getKoszt() + " zł.");
        }
    }

    public void zapiszZamowienia() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("plik.txt"))) {
            for (Zamowienie element : listaZamowien) {
                writer.write("Zamówienie na drewna dekoracyjne nr: " + element.getId() + " na: " + element.getTyp() + " o rodzaju: " + element.getRodzaj() + " koszt: " + element.getKoszt() + " zł.");
                writer.newLine();
            }

            for (ZamowienieNaOpal element : listaNaOpal) {
                writer.write("Zamówienie na drewna na opał nr: " + element.getId() + " na " + element.getTony() + " ton drewna" + " o koszcie: " + element.getKoszt() + " zł.");
                writer.newLine();
            }

            for (ZamowienieDeski element : listazamMetrow) {
                writer.write("Zamówienie na deski nr: " + element.getId() + " na : " + element.getM3() + "m3 desek koszt: " + element.getKoszt() + " zł.");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

