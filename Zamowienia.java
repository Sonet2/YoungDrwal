import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Zamowienia {
    //private HashMap<String, String> mapa = new HashMap<>();
    Map<Integer, String > mapaTypow = new IdentityHashMap<Integer, String>();
    Map<Integer, String > mapaRodzaji = new IdentityHashMap<Integer, String>();

    ArrayList<String> lista = new ArrayList<>();

    private Float koszt;
    private int id = 0;
    public Zamowienia()
    {

    }

    public void DodajZamowienie(String typDrewna, String rodzajDrewna)
    {
//        mapaTypow.put(this.id, typDrewna);
//        mapaRodzaji.put(this.id, rodzajDrewna);
        lista.add(typDrewna);
    }

    public void WypiszZamowienia()
    {
//        for(int k: mapaTypow.keySet())
//        {
//            System.out.println("Zamówienie nr: " + this.id + " ");
//        }
        for(String k: lista)
        {
            System.out.println("Zamówienie na " + k);
        }
    }
}
