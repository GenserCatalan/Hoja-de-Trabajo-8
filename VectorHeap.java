import java.util.Collections;
import java.util.Vector;

// Clase VectorHeap que implementa PriorityQueue para manejar una cola con prioridad basada en un Heap
class VectorHeap<T extends Comparable<T>> implements PriorityQueue<T> {
    private Vector<T> PacientesList;

    public VectorHeap() {
        PacientesList = new Vector<>();
    }

    //Metodo para añadir elemento a la cola
    @Override
    public boolean add(T elemento) {
        PacientesList.add(elemento);
        // Llamar a sort con un comparador que use el método compareTo de Comparable
        Collections.sort(PacientesList, (a, b) -> a.compareTo(b));
        return true;
    }

    // Método para eliminar y devolver el elemento de mayor prioridad de la cola
    @Override
    public T remove() {
        return PacientesList.remove(0);
    }

    // Método para obtener el elemento de mayor prioridad de la cola sin eliminarlo
    @Override
    public T peek() {
        return PacientesList.get(0);
    }

    // Método para obtener el tamaño de la cola
    @Override
    public int size() {
        return PacientesList.size();
    }

    // Método para verificar si la cola está vacía
    @Override
    public boolean isEmpty() {
        return PacientesList.isEmpty();
    }

    // Método para limpiar la cola, eliminando todos los elementos
    @Override
    public void clear() {
        PacientesList.clear();
    }

}
