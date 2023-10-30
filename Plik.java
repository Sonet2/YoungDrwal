import java.io.File;

public class Plik {
    public void main()
    {
        File f = new File("plik.txt");// tutaj można dać dokładną ściężkę na przykład "C:\\windows\\plik.txt"
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

    }
}
