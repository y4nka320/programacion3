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

}

