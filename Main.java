import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        VectorHeap<Paciente> colaEmergencias = new VectorHeap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                char codigoEmergencia = datos[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                colaEmergencias.add(paciente);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de pacientes: " + e.getMessage());
        }

        // Atender pacientes según su prioridad
        while (!colaEmergencias.isEmpty()) {
            Paciente pacienteAtendido = colaEmergencias.remove();
            System.out.println("Prioridad de paciente: " + pacienteAtendido);
        }
    }
}
