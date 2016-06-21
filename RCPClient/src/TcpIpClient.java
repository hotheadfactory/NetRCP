import java.net.Socket;
 
public class TcpIpClient {
    public static void main(String[] args) {
        try{
            String serverIp = "168.131.35.107";
            Socket socket = new Socket(serverIp, 7777);
             
            System.out.println("서버에 연결되었습니다.");
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);
             
            sender.start();
            receiver.start();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
