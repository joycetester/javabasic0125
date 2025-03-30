package Bai1_Toantu;

public class Toan_tu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a++;
        // ++ hoặc -- sẽ tăng giá trị liền chỉ cho cái biến đó, còn trong 1 hàm phức tạp thì không nên viết ++ hoặc --
        //số học
        System.out.println("a % b = " + (a % b));
        int c = a + b;

        //quan hệ
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);

        //toán tử logic
        System.out.println(c);
        System.out.println((a>b) && (b<c));
        System.out.println((a<b) || (b<c));

        //toán tử điều kiện
        int m = 50;
        int n = 200;

        String result = (m % n ==0) ? "m chia hết cho n" : "m không chia hết cho n";
        System.out.println(result);

        //toan tử gán
        int var = 20;
        int v,q,r,x;
        v=q=r=x=var;
        System.out.println(r);
        System.out.println(q);

    }
}
