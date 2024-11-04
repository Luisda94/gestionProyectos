package modelo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;
    private List<Empleado> equipo;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
        this.equipo = new ArrayList<>();
    }

}

