package factory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Демонстрация работы с фабрикой
 */
public class FactoryTest {
    /**
     * Создание билетов с помощью фабрики
     */
    @Test
    public void testTicketsFactory() {
        TicketsFactory factory = new TicketsFactory();
        // Настраиваем фабрику
        factory.setPrice(1000);
        factory.setOrigin("Санкт-Петербург");

        Ticket t1 = factory.buyTicket("Иванов Иван Иванович");
        assertEquals("Номер билета", 1, t1.id);
        assertEquals("Стандартная цена билета", 1000.0, t1.price);
        assertEquals("Санкт-Петербург", t1.origin);
        assertEquals("Иванов Иван Иванович", t1.name);

        Ticket t2 = factory.buyTicket("Петров Пётр Петрович");
        assertEquals("Номер билета", 2, t2.id);
        assertEquals("Стандартная цена билета", 1000.0, t2.price);
        assertEquals("Санкт-Петербург", t2.origin);
        assertEquals("Петров Пётр Петрович", t2.name);
    }
}
