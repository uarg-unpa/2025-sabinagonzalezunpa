package tp1.tp2;

public class Cancion {
 
  private String nombre;
  private String cantante;
  private String compositor;
  private String generomusical;
  
  public Cancion(String nombre, String cantante, String compositor, String generomusical)
  {
    this.nombre=nombre;
    this.cantante=cantante;
    this.compositor=compositor;
    this.generomusical=generomusical;
  }
  public String getNombre()
  {
    return this.nombre;
  }
  public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }
  public String getCantante()
  {
    return this.cantante;
  }
  public void setCantante(String cantante)
  {
    this.cantante=cantante;
  }
  public String getCompositor()
  {
    return this.compositor;
  }
  public void setCompositor(String compositor)
  {
    this.compositor=compositor;
  }
  public String getGeneromusical()
  {
    return this.generomusical;
  }
  public void setGeneromusical(String generomusical)
  {
    this.generomusical=generomusical;
  }
}