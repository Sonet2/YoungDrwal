import java.util.ArrayList;

public abstract class ProduktZDrewna {
    public String nazwa;
    public RodzajDrewna rodzaj;

    public ProduktZDrewna(String nazwa, RodzajDrewna rodzaj)
    {
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
    }

}
