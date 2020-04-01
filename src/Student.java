import java.util.ArrayList;
import java.util.Optional;

/**
 * Student
 */
public class Student {
    /**
     * Khởi tạo
     * 
     * @param studentId   MSV
     * @param name        Tên
     * @param className   Lớp
     * @param phoneNumber SDT
     * @param email       Email
     * @param address     Địa chỉ
     */
    public Student(String studentId, String name, String className, String phoneNumber, String email, String address) {
        this.StudentId = studentId;
        this.Name = name;
        this.Class = className;
        this.PhoneNumber = phoneNumber;
        this.Email = email;
        this.Address = address;
    }

    /**
     * Tạo list Student mặc định
     */
    public static ArrayList<Student> students = new ArrayList<Student>() {
        /**
		 *
		 */
		private static final long serialVersionUID = 1L;

		{
            add(new Student("17021321", "Tran Thu Phuong", "K62-CACLC", "0123456789", "@abc.com", "HN"));
            add(new Student("17021325", "Nguyen Minh Quan", "K62-CACLC", "0123456789", "@abc.com", "VP"));
            add(new Student("17021326", "Nguyen Tuan Quoc", "K62-CACLC", "0123456789", "@abc.com", "VP"));
        }
    };

    /** MSV */
    public String StudentId;
    /** Tên SV */
    public String Name;
    /** Lớp */
    public String Class;
    /** SĐT của SV */
    public String PhoneNumber;
    /** Email */
    public String Email;
    /** Địa chỉ */
    public String Address;

    /**
     * Hàm lấy thông tin SV
     * 
     * @param studentId MSV
     * @return TT của SV
     */
    public static String GetStudent(String studentId) {
        try {
            Optional<Student> resStudent = Student.students.stream().filter(s -> s.StudentId.equals(studentId)).findFirst();
            
            return "\nStudentId: " + resStudent.get().StudentId + "\nName: " + resStudent.get().Name + "\nClass: " + resStudent.get().Class + "\nPhoneNumber: " + resStudent.get().PhoneNumber + "\nEmail: " + resStudent.get().Email + "\nAddress: " + resStudent.get().Address + "\n";
        } catch(Exception e) {
        }

        return "Not Found!\n";
    }
}