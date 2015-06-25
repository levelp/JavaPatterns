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

    // Только изнутри класса можно делать новые объекты
    private Singletone() {
    }

    public static Singletone instance() {
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
