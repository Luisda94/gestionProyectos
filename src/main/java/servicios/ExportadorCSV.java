package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVWriter;

import modelo.Proyecto;
import modelo.Tarea;

public class ExportadorCSV {
    public void exportarTareas(List<Proyecto> proyectos) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter("tareas.csv"))) {
            for (Proyecto proyecto : proyectos) {
                for (Tarea tarea : proyecto.getTareas()) {
                    String[] linea = {
                        proyecto.getNombre(),
                        tarea.getDescripcion(),
                        tarea.getAsignado().getNombreE()
                    };
                    writer.writeNext(linea);
                }
            }
        }
    }

}
