package creational.singletone;

/**
 * Одиночка:
 * цель: обеспечить чтобы в программе у нас был только один экзепляр
 * какого-то класса
 */
public class Singletone {
    // В ДАННОЙ РЕАЛИЗАЦИИ НАМ СЧЁТЧИК НЕ НУЖЕН
    // ОН БУДЕТ НУЖЕН ЕСЛИ МЫ СДЕЛАЕМ КОНСТРУКТОР
    // НЕ private
    // >>>
    // Считаем количество созданных объектов
    static int count = 0;
    // Один-единственный уникальный экземпляр данного класса
    static Singletone uniqueInstance;
    // <<<
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
