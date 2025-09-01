package tp1.tp2;

public class Domicilio {
  
    String barrio;
    String provincia;
    String ciudad;
    int numero;
    int CódigoPostal;

    public Domicilio(String barrio, String provincia, String ciudad, int numero, int CódigoPostal)
    {
        this.barrio=barrio;
        this.provincia=provincia;
        this.ciudad=ciudad;
        this.numero=numero;
        this.CódigoPostal=CódigoPostal; 
    }
    public String getBarrio()
    {
        return this.barrio;
    }
    public void setBarrio(String barrio)
    {
        this.barrio=barrio;
    }
    public String getProvincia()
    {
        return this.provincia;
    }
    public void setProvincia(String provincia)
    {
        this.provincia=provincia;
    }
    public String getCiudad()
    {
        return this.ciudad;
    }
    public void setCiudad(String ciudad)
    {
        this.ciudad=ciudad;
    } 
    public int getNumero()
    {
        return this.numero;
    }
    public void setNumero(int numero)
    {
        this.numero=numero;
    }
    public int getCódigoPostal()
    {
         return this.CódigoPostal;
    }
    public void setCódigoPostal(int CódigoPostal)
    {
        this.CódigoPostal=CódigoPostal;
    }
}