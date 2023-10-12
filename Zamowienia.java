import java.util.ArrayList;

public class Zamowienia {
    private ArrayList<Zamowienie> listaZamowien = new ArrayList<>();
    private int id;

    public void DodajZamowienie(int id, String typDrewna, String rodzajDrewna, float koszt)
    {
        listaZamowien.add(new Zamowienie(id, typDrewna, rodzajDrewna, koszt));
    }

    public void WypiszZamowienia()
    {
        for(Zamowienie zamowienie: listaZamowien)
        {
            System.out.println("Zamówienie nr: " + zamowienie.getId() + " na: " + zamowienie.getTyp() + " o rodzaju: " + zamowienie.getRodzaj() + " koszt: " + zamowienie.getKoszt() + " zł.");
        }
    }
}
