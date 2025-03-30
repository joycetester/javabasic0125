package Bai1_Array;

public class Mang_Array {
    public static void main(String[] args) {
        //Khai báo mảng
        int mangSoNguyen [];

        //Khởi tạo mảng đã được khai báo
        //Khi khai báo mảng rồi thì lúc khởi tạo mảng chỗ vế đầu chỉ cần gọi tên mảng không cần dấu []
        mangSoNguyen = new int [10];

        //Khai báo và khởi tạo mảng
        int mangSoNguyen2 [] = new int [5];
        String listMenu [] = new String [10];

        //Gán giá trị vào mảng
        listMenu [0] = "Dashboard"; //gán giá trị cho mảng listMenu ở vị trí thứ nhất
        listMenu [2] = "Tasks"; //gán giá trị cho mảng listMenu ở vị trí thứ 3

        //Truy xuaat giá trị thủ công từng vị trí
        System.out.println(listMenu [0]);
        System.out.println(listMenu [2]);

        //truy xuất dùng vòng lặp for

        System.out.println("==========================");

        //Khai báo + khởi tạo + gán gtri cho mảng (nặc danh)
        int a [] = {33,3,4,5,6};
        System.out.println(a [2]);

        a [4] = 1000; //gán thêm gtri cho mảng a

        //in mảng a bằng vòng lặp for
        for (int i = 0; i < a.length; i++) {
            System.out.println( i);
        }




    }
}
