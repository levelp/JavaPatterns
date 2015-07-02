package factory;

/**
 * Билет (объект для фабрики билетов)
 */
public class Ticket {
    static int counter = 0;
    /**
     * Идентификатор - уникальный номер билета
     */
    public final int id;
    /**
     * Цена билета
     */
    public final double price;

    /**
     * Откуда
     */
    public final String origin;

    /**
     * ФИО пассажира
     */
    public final String name;

    public Ticket(String name, double price, String origin) {
        id = ++counter;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }
}
