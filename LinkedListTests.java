import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend(){
        LinkedList ll = new LinkedList();
        ll.append(2);
        assertEquals(2,ll.root.value);
    }

    @Test
    public void testPrepend(){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.prepend(4);
        assertEquals(4,ll.root.value);
    }

    @Test
    public void testFirst(){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.prepend(4);
        ll.prepend(6);
        assertEquals(6,ll.first());
    }

    @Test
    public void testLast(){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.prepend(4);
        ll.prepend(6);
        assertEquals(2,ll.last());
    }

    @Test
    public void testToString(){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.prepend(4);
        ll.prepend(6);
        assertEquals("2 4 6 ",ll.toString());
    }

    @Test
    public void testLength(){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.prepend(4);
        ll.prepend(6);
        assertEquals(3,ll.length());
    }
}
