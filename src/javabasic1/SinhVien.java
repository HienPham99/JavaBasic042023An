package javabasic1;

public class SinhVien {
    String name = "Phạm Thị Hiền";

    public void sayName() {
        System.out.println(name);
    }

    static String maSV = "SV12345";

    public static void main(String[] args) {
        int age = 25;
        SinhVien sv = new SinhVien();
        sv.sayName();
        System.out.println("Mã Sinh viên: " + maSV);

        System.out.println("Tuổi: " + age);

        System.out.println("Email: " + ThongTin.emailAddress);

        System.out.println("Đến từ: " + ThongTin.address);

    }


}
