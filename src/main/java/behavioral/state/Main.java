package behavioral.state;

public class Main {
    public static void main(String[] args) throws Exception {
        MySocket socket = new MySocket();

        socket.send("Send");
        socket.close();
        socket.send("Send2");
    }
}
