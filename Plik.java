import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;

public class Plik {
    File f = new File("plik.txt");
    public void stworzPlikJakNieMa() {
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }}

