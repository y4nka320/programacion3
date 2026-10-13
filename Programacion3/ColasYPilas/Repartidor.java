package Programacion3.ColasYPilas;

public class Repartidor 
{
    private String seguroSocial;
    private String marcaAnunciada;
    private int jornadaLaboral;

    public Repartidor(String seguroSocial, String marcaAnunciada, int jornadaLaboral) 
    {
        this.seguroSocial = seguroSocial;
        this.marcaAnunciada = marcaAnunciada;
        this.jornadaLaboral = jornadaLaboral;
    }

    public String getSeguroSocial() 
    {
        return seguroSocial;
    }

    public String getMarcaAnunciada() 
    {
        return marcaAnunciada;
    }

    public int getJornadaLaboral() 
    {
        return jornadaLaboral;
    }

    public void sumarDiaLaboral() 
    {
        this.jornadaLaboral++;
    }

    public void setMarcaAnunciada(String marcaAnunciada) 
    {
        this.marcaAnunciada = marcaAnunciada;
    }

}
