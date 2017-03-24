package behavioral.state;

public class MySocket {
    private SocketState state = SocketState.OPENED;

    public void close() throws Exception {
        state.handleClose();
        state = SocketState.CLOSED;
    }

    public void send(Object object) throws Exception {
        state.handleSend(object);
    }
}
