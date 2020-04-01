import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private Client() {
    };

    public static void main(String[] args) throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry();
        Hello stub = (Hello) registry.lookup("Hello");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'EXIT' to exit!\n");
        while (true) {
            System.out.print("Enter Student Id: ");
            String studentId = sc.nextLine();
            if (studentId.toUpperCase().equals("EXIT")) break;
            System.out.println("Student Info:\n" + stub.sayHello(studentId));
        }
        sc.close();
   }
}
