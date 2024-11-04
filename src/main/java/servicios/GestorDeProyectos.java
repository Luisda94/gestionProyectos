package servicios;

import java.util.ArrayList;
import java.util.List;

import modelo.Proyecto;

public class GestorDeProyectos {
	   private List<Proyecto> proyectos;

	    public GestorDeProyectos() {
	        this.proyectos = new ArrayList<>();
	    }
	    // Crear un nuevo proyecto
	    public void crearProyecto(String nombre) {
	        Proyecto nuevoProyecto = new Proyecto(nombre);
	        proyectos.add(nuevoProyecto);
	        System.out.println("Proyecto creado: " + nombre);
	    }

	    // Leer todos los proyectos
	    public void listarProyectos() {
	        if (proyectos.isEmpty()) {
	            System.out.println("No hay proyectos disponibles.");
	        } else {
	            System.out.println("Lista de proyectos:");
	            for (int i = 0; i < proyectos.size(); i++) {
	                System.out.println((i + 1) + ". " + proyectos.get(i).getNombre());
	            }
	        }
	    }

	    // Leer un proyecto específico por nombre
	    public Proyecto obtenerProyecto(String nombre) {
	        for (Proyecto proyecto : proyectos) {
	            if (proyecto.getNombre().equalsIgnoreCase(nombre)) {
	                return proyecto;
	            }
	        }
	        System.out.println("Proyecto no encontrado: " + nombre);
	        return null;
	    }

	    // Actualizar un proyecto existente
	    public void actualizarProyecto(String nombreActual, String nuevoNombre) {
	        Proyecto proyecto = obtenerProyecto(nombreActual);
	        if (proyecto != null) {
	            proyecto.setNombre(nuevoNombre);
	            System.out.println("Proyecto actualizado: " + nuevoNombre);
	        } else {
	            System.out.println("No se pudo actualizar el proyecto: " + nombreActual);
	        }
	    }

	    // Eliminar un proyecto
	    public void eliminarProyecto(String nombre) {
	        Proyecto proyecto = obtenerProyecto(nombre);
	        if (proyecto != null) {
	            proyectos.remove(proyecto);
	            System.out.println("Proyecto eliminado: " + nombre);
	        } else {
	            System.out.println("No se pudo eliminar el proyecto: " + nombre);
	        }
	    }
}
