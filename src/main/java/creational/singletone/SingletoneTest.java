package creational.singletone;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Демонстрация работы Singletone
 */
public class SingletoneTest {

    @Test
    public void testSimple() {
        assertNull("Объект ещё не создан", Singletone.uniqueInstance);
        assertEquals(0, Singletone.count);
        Singletone s1 = Singletone.instance();
        assertEquals(1, s1.id);
        Singletone s2 = Singletone.instance();
        assertEquals(1, s2.id);
        assertEquals(1, Singletone.instance().id);
        assertEquals(1, Singletone.instance().id);
    }
}
