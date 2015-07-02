package creational.singletone;

/**
 * Одиночка
 */
public class Singletone {
    // Считаем количество созданных объектов
    static int count = 0;
    static Singletone uniqueInstance;
    // Идентификатор
    int id = ++count;

    /**
     * Конструктор приватный - чтобы получить экземпляр класса нужно обязательно вызвать статический метод instance,
     * который заботится о том, что во всей системе есть только один экземпляр класса.
     * Только изнутри класса можно делать новые объекты
     */
    private Singletone() {
    }

    public synchronized static Singletone instance() {
        // Если нет ещё ни одного экземпляра объекта => создаём
        if (uniqueInstance == null) {
            uniqueInstance = new Singletone();
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return "Object #" + id;
    }
}
