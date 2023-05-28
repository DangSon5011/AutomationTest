package BT_JAVA_OOP_1;

public class ThongTin {

    static void main(String[] args) {
        NhanVien nhanVienA = new NhanVien();
        nhanVienA.setName("Đăn Văn A");
        nhanVienA.setAge(18);
        nhanVienA.setGender("Male");
        nhanVienA.setId(1234);

        System.out.println("Nhân viên tên: " + nhanVienA.getName());
        System.out.println("Tuổi: " + nhanVienA.getAge());
        System.out.println("Giới tính: " + nhanVienA.getGender());
        System.out.println("Mã nhân viên: " + nhanVienA.getId());
    }
}
