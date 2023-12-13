import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void serverCheck(String ip, int port) throws IOException {
        try {
            clientSocket = new Socket(ip, port);
            System.out.println("server online");
        }catch (Exception e){
            System.out.println("server offline");
        }
    }

    public void portCheck(String ip,int start,int end) throws IOException {
        Socket socket;

        for (int i=start;i<=end;i++){
            try {
                socket = new Socket(ip,i);
                System.out.print("IP:\t" + ip + "\tport:\t" + i + "\t name:\t");
                switch (i){
                    case 20:
                        System.out.print("FTP");
                        break;
                    case 21:
                        System.out.print("FTP");
                        break;
                    case 22:
                        System.out.print("SSH");
                        break;
                    case 25:
                        System.out.print("SMTP");
                        break;
                    case 53:
                        System.out.print("DNS");
                        break;
                    case 80:
                        System.out.print("http");
                        break;
                    case 123:
                        System.out.print("NTP");
                        break;
                    case 443:
                        System.out.print("https");
                        break;
                    default:
                        System.out.print("no name");
                        break;
                }
                System.out.println("");
            }catch (Exception e){

            }
        }
    }


    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }
    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    public static void main(String[] args) throws IOException {
        Client greetClient = new Client();
//        greetClient.serverCheck("localhost",6666);
        greetClient.portCheck("localhost",100,500);

    }
}