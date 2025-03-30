package Bai1_IF_ELSE;

public class Menhde_IF_ELSE {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String expected = "Customer Sumary";

        //Mệnh đề if
        //nếu như phép toán thoả mãn điều kiện thì khi chạy sẽ trả về giá trị của sout
        if (a < b) {
            System.out.println("trả giá trị đúng về");
        }

        if (expected.equals("Customer Sumary")) {
            System.out.println("TC passed");
        }
        //trong if có thể kết hợp nhiều điều kiện bằng các toán tử so sánh ví dụ &&, ||
        //như ở đk này vì là phép && nên đk cần thoả mãn 2 tiêu chí để sout trả kết quả
        if ((a < b) && (expected.equals ("Customer"))) {
            System.out.println("passed");
        }


        //Mệnh đề if else

        }

    }
