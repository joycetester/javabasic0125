package Bai1_Variables;

public class Variables_Learn1 {
    String address = "Hà Nội"; //biến instance
    static String phone = "0909094849"; //biến static
    public static void main(String[] args) {
        String name = "Trần Thục Nhi";
        System.out.println(name);
        String nickname = "Joyce Tran";
        int age = 25;
        String dateofbirth = "01/11/2000";
        System.out.println(nickname);
        System.out.println(age);
        System.out.println("Ngày tháng năm sinh:" + dateofbirth); //khai báo kiểu chuỗi
        //sout là để truy xuất
        //default của int là 0
        System.out.println(phone);

    }
    public void Sayhello () {
        int number = 100; //biến local
        System.out.println(address);
        System.out.println(phone);
    }
    public void getinfo () {
        System.out.println(address);
        System.out.println(Variables_Learn1.phone);//biến static đc khai báo bằng tên class.tên biến
    }
}
