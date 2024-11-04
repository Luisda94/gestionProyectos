package modelo;

public class Tarea {
    private String descripcion;
    private Empleado asignado;
    private boolean completado;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completado = false;
    }

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empleado getAsignado() {
		return asignado;
	}

	public void setAsignado(Empleado asignado) {
		this.asignado = asignado;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	@Override
	public String toString() {
		return "Tarea [descripcion=" + descripcion + ", asignado=" + asignado + ", completado=" + completado + "]";
	}

}
