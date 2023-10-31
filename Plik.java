import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;

public class Plik {
    Zamowienia zamowienia = new Zamowienia();
    File f = new File("plik.txt");
    public void main()
    {
        if(!f.exists()){
            try{
                f.createNewFile();
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }
    }
    public void Zapis()
    {
        if(f.canWrite())
        {
            try{
                FileWriter write = new FileWriter("plik.txt");
                System.out.println(zamowienia.listaZamowien);
                for(Zamowienie zamowienie: zamowienia.listaZamowien) {
                    write.write("Zamówienie na drewna dekoracyjne nr: " + zamowienie.getId() + " na: " + zamowienie.getTyp() + " o rodzaju: " + zamowienie.getRodzaj() + " koszt: " + zamowienie.getKoszt() + " zł.");
                }

                write.close();






            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }



    }
}
