import java.io.IOException;
import java.util.Scanner;

public class UserPanel {
    public static void menu() throws IOException {
        System.out.println("Choose to continue :");
        System.out.println("1:connect to server\n" +
                "2:Get online ports\n" +
                "3:Use Get method\n" +
                "4:Use Post method");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Enter IP:");
                sc.nextLine();
                String ip =  sc.nextLine();
                System.out.println("Enter Port:");
                int port =  sc.nextInt();
                Client.serverCheck(ip, port);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;

        }
        menu();
    }
}
