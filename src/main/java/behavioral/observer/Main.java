package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.attach(new AbstractObserver<Integer>() {
            @Override
            public void update(EventKind kind, Integer data) {
                System.out.println("Changed: " + kind + " " + data);
            }
        });
        queue.attach(new AbstractObserver<Integer>() {
            @Override
            public void update(EventKind kind, Integer data) {
                if (kind == EventKind.CREATE) {
                    System.out.println("Observer 2: create " + data);
                }
            }
        });

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.poll();
        queue.poll();
    }
}
