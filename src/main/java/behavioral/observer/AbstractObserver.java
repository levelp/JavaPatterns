package behavioral.observer;

public interface AbstractObserver<T> {
    void update(EventKind kind, T data);
}
