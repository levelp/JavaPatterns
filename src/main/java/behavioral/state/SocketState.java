package behavioral.state;

public interface SocketState {

    SocketState OPENED = new SocketState() {
        @Override
        public void handleSend(Object object) {
            System.out.println("sent...");
        }

        @Override
        public void handleClose() {
            System.out.println("close...");
        }
    };
    SocketState CLOSED = new SocketState() {
        @Override
        public void handleSend(Object object) throws Exception {
            throw new Exception("Socket closed");
        }

        @Override
        public void handleClose() {
        }
    };
    SocketState BROKEN = new SocketState() {
        @Override
        public void handleSend(Object object) throws Exception {
            throw new Exception("Socket broken");
        }

        @Override
        public void handleClose() throws Exception {
            throw new Exception("Socket broken");
        }
    };

    void handleSend(Object object) throws Exception;

    void handleClose() throws Exception;
}
