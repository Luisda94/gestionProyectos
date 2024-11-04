package modelo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;
    private List<Empleado> equipo;

    public Proyecto(String nombre) {
        this.setNombre(nombre);
        this.setTareas(new ArrayList<>());
        this.setEquipo(new ArrayList<>());
    }

	public String getNombre() {
		return nombre;	
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public List<Empleado> getEquipo() {
		return equipo;
	}

	public void setEquipo(List<Empleado> equipo) {
		this.equipo = equipo;
	}

}

