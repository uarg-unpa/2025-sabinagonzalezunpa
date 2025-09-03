package tp1.tp2;

public class Televisor {

    private boolean encenderCanal;
    private int subirCanal;
    private int bajarCanal;
    private int subirVolumen;
    private int bajarVolumen;

    public Televisor (boolean encenederCanal, int subirCanal, int bajarCanal, int subirVolumen, int bajarVolumen)
    {
        this.encenderCanal=encenederCanal;
        this.subirCanal=subirCanal;
        this.bajarCanal=bajarCanal;
        this.subirVolumen=subirVolumen;
        this.bajarVolumen=bajarVolumen;
    }
    public boolean getEncenderCanal()
    {
        return this.encenderCanal;
    }
    public void setEncenderCanal(boolean encenderCanal)
    {
        this.encenderCanal=encenderCanal;
    }
    public int getSubirCanal()
    { 
        return this.subirCanal;
    }
    public void setSubirCanal(int subirCanal)
    {
        this.subirCanal=subirCanal;
    }
    public int getBajarCanal()
    {
        return this.bajarCanal;
    }
    public void setBajarCanal(int bajarCanal)
    {
        this.bajarCanal=bajarCanal;
    }
    public int getSubirVolumen()
    {
        return this.subirVolumen;
    }
    public void setSubirVolumen(int subirVolumen)
    {
        this.subirVolumen=subirVolumen;
    }
    public int getBajarVolumen()
    {
        return this.bajarVolumen;
    }
    public void setBajarVolumen(int bajarVolumen)
    {
        this.bajarVolumen=bajarVolumen;
    }
}