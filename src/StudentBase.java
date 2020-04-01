import java.rmi.Remote;

public interface StudentBase extends Remote {
    public String GetStudent(String studentId);
}