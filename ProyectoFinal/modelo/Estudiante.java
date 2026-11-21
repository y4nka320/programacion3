package ProyectoFinal.modelo;
 
import java.util.LinkedList;
import java.util.List;
 
public class Estudiante extends Persona{

    private int semestre;
    private Double[][] notas = new Double[10][20];
    private List<Materia> historialMaterias = new LinkedList<>();
 
    public Estudiante(String nombre, String id, String email, int semestre)
    {
        super(nombre, id, email);
        this.semestre = semestre;
    }
 
    public int getSemestre()
    {
        return semestre;
    }
 
    public void setSemestre(int semestre)
    {
        this.semestre = semestre;
    }
 
    public Double[][] getNotas()
    {
        return notas;
    }
 
    public List<Materia> getHistorialMaterias()
    {
        return historialMaterias;
    }


    public void agregarMateriaHistorial(Materia materia)
    {
        boolean existe = false;
        for (int i = 0; i < historialMaterias.size(); i++)
        {
            if (historialMaterias.get(i).getCodigo().equalsIgnoreCase(materia.getCodigo()))
            {
                existe = true;
                break;
            }
        }
 
        if (!existe)
        {
            historialMaterias.add(materia);
        }
    }

    public void removerMateriaHistorial(String codigoMateria)
    {
        for (int i = historialMaterias.size() - 1; i >= 0; i--)
        {
            if (historialMaterias.get(i).getCodigo().equalsIgnoreCase(codigoMateria))
            {
                historialMaterias.remove(i);
            }
        }
    }
 
    public boolean tieneMateriaAprobada(String codigoMateria)
    {
        for (int i = 0; i < historialMaterias.size(); i++)
        {
            if (historialMaterias.get(i).getCodigo().equalsIgnoreCase(codigoMateria))
            {
                return true;
            }
        }
        return false;
    }

    

}

