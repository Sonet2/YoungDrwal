public class ZamowienieDeski {
    private int idDeski;
    private float m3;
    private float koszt;

    public ZamowienieDeski(int id, float m3, float koszt)
    {
        this.idDeski = id;
        this.m3 = m3;
        this.koszt = koszt;
    }

    public int getId()
    {
        return this.idDeski;
    }

    public float getM3()
    {
        return this.m3;
    }

    public float getKoszt()
    {
        return this.koszt;
    }
}
