package modelo;

public class Empleado {
    private String nombreE;
    private String puestoE;

    public Empleado(String nombreE, String puestoE) {
        this.nombreE = nombreE;
        this.puestoE = puestoE;
    }

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getPuestoE() {
		return puestoE;
	}

	public void setPuestoE(String puestoE) {
		this.puestoE = puestoE;
	}

	@Override
	public String toString() {
		return "Empleado [nombreE=" + nombreE + ", puestoE=" + puestoE + "]";
	}
	
}
