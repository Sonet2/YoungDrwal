public class ZamowienieDach {
    private int id;
    private float m3;
    private float koszt;

    public ZamowienieDach(int id, float m3, float koszt)
    {
        this.id = id;
        this.m3 = m3;
        this.koszt = koszt;
    }

    public int getId()
    {
        return this.id;
    }

    public float getM3(){return this.m3;}

    public float getKoszt()
    {
        return this.koszt;
    }
}
