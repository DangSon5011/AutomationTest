import java.util.ArrayList;

public class JavaBasic5 {
    static ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();

    static public void addNhanVien(NhanVien person) {
        JavaBasic5.listNhanVien.add(person);
    }

    static public void showListNhanVien() {
        for (int i = 0; i < JavaBasic5.listNhanVien.size(); i++) {
            System.out.println("Nhân viên: " + listNhanVien.get(i).getName() + ". " +
                    "Tuổi: " + listNhanVien.get(i).getAge() + ". " +
                    "Mã nhân viên: " + listNhanVien.get(i).getId());
        }
    }

    static public void main(String[] args) {
        NhanVien teo = new NhanVien();
        teo.setName("Nguyễn Văn Tèo");
        teo.setAge(20);
        teo.setId(20113004);
        JavaBasic5.addNhanVien(teo);

        NhanVien ty = new NhanVien();
        ty.setName("Đinh Thị Tý");
        ty.setAge(29);
        ty.setId(20192202);
        JavaBasic5.addNhanVien(ty);

        NhanVien suu = new NhanVien();
        suu.setName("Trần Đình Sửu");
        suu.setAge(40);
        suu.setId(6227117);
        JavaBasic5.addNhanVien(suu);

        JavaBasic5.showListNhanVien();
    }
}
