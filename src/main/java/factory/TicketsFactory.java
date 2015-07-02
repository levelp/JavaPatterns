package factory;

/**
 * Касса по продаже билетов содержит определённые настройки
 */
public class TicketsFactory {
    private int price;
    private String origin;

    /**
     * Покупка билета
     *
     * @param name на имя
     * @return Новый билет
     */
    public Ticket buyTicket(String name) {
        return new Ticket(name, price, origin);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
