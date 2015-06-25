package behavioral.observer;

public interface AbstractSubject<T> {
    void attach(AbstractObserver<T> observer);

    void detach(AbstractObserver<T> observer);

    void notifyObservers(EventKind kind, T data);
}
