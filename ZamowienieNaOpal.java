public class ZamowienieNaOpal {
    private int id;
    private float tony;
    private float koszt;

    public ZamowienieNaOpal(int id, float tony, float koszt)
    {
        this.id = id;
        this.tony = tony;
        this.koszt = koszt;
    }

    public int getId()
    {
        return this.id;
    }

    public float getTony(){return this.tony;}

    public float getKoszt()
    {
        return this.koszt;
    }
}
