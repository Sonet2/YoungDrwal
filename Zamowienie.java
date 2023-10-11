public class Zamowienie {
    private int id;
    private String typDrewna;
    private String rodzajDrewna;
    private float koszt;

    public Zamowienie(int id, String typDrewna, String rodzajDrewna, float koszt)
    {
        this.id = id;
        this.typDrewna = typDrewna;
        this.rodzajDrewna = rodzajDrewna;
        this.koszt = koszt;
    }

    public int getId()
    {
        return this.id;
    }

    public String getTyp()
    {
        return this.typDrewna;
    }

    public String getRodzaj()
    {
        return this.rodzajDrewna;
    }

    public float getKoszt()
    {
        return this.koszt;
    }
}
