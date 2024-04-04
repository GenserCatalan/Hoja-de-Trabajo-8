import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PacientesTest {
    private VectorHeap<Paciente> colaEmergencias;

    @Before
    public void setUp() {
        colaEmergencias = new VectorHeap<>();
    }

    // Test para verificar el método add de VectorHeap
    @Test
    public void testAdd() {
        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente p2 = new Paciente("Maria Ramirez", "apendicitis", 'A');

        colaEmergencias.add(p1);
        assertEquals(1, colaEmergencias.size());

        colaEmergencias.add(p2);
        assertEquals(2, colaEmergencias.size());
        assertEquals(p2, colaEmergencias.peek()); 
    }

    // Test para verificar el método remove de VectorHeap
    @Test
    public void testRemove() {
        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente p2 = new Paciente("Maria Ramirez", "apendicitis", 'A');

        colaEmergencias.add(p1);
        colaEmergencias.add(p2);

        assertEquals(p2, colaEmergencias.remove()); 
        assertEquals(1, colaEmergencias.size());
        assertEquals(p1, colaEmergencias.peek()); 
    }

    // Test para verificar el método peek de VectorHeap
    @Test
    public void testPeek() {
        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente p2 = new Paciente("Maria Ramirez", "apendicitis", 'A');

        colaEmergencias.add(p1);
        colaEmergencias.add(p2);

        assertEquals(p2, colaEmergencias.peek()); 
    }

    // Test para verificar el método size de VectorHeap
    @Test
    public void testSize() {
        assertEquals(0, colaEmergencias.size());

        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        colaEmergencias.add(p1);

        assertEquals(1, colaEmergencias.size());
    }

    // Test para verificar el método isEmpty de VectorHeap
    @Test
    public void testIsEmpty() {
        assertTrue(colaEmergencias.isEmpty());

        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        colaEmergencias.add(p1);

        assertFalse(colaEmergencias.isEmpty());
    }

    // Test para verificar el método clear de VectorHeap
    @Test
    public void testClear() {
        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        colaEmergencias.add(p1);

        assertFalse(colaEmergencias.isEmpty());

        colaEmergencias.clear();

        assertTrue(colaEmergencias.isEmpty());
        assertEquals(0, colaEmergencias.size());
    }
}
