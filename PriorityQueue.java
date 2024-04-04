// Interfaz PriorityQueue para una cola con prioridad
interface PriorityQueue<T extends Comparable<T>> {
    boolean add(T elemento);
    T remove();
    T peek();
    int size();
    boolean isEmpty();
    void clear();
}
