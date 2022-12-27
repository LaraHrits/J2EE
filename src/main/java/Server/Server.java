package Server;

public class Server {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        Thread tCharServer = new Thread(chatServer);
        tCharServer.start();
    }
}
