package behavioral.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queue implements AbstractSubject<Integer> {

    private LinkedList<Integer> list = new LinkedList<>();


    private List<AbstractObserver<Integer>> observers = new ArrayList<>();

    public void push(int value) {
        list.push(value);
        notifyObservers(EventKind.CREATE, value);
    }

    public int poll() {
        Integer polled = list.poll();
        notifyObservers(EventKind.DELETE, polled);
        return polled;
    }

    @Override
    public void attach(AbstractObserver<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(AbstractObserver<Integer> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(EventKind kind, Integer data) {
        for (AbstractObserver<Integer> observer : observers) {
            observer.update(kind, data);
        }
    }
}
