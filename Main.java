public class Main {
    public static void main(String[] args) throws ZlaWartosc {
        System.out.println("Witamy serdecznie w Sklepie z Drewnem");
        Zarzadzanie zarzadzanie = new Zarzadzanie();
        while(true)
        {
            zarzadzanie.Menu();
        }
    }
}