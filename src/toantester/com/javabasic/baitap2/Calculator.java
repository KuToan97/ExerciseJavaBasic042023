package toantester.com.javabasic.baitap2;
public class Calculator {
    public static int sum2SoNguyen(int songuyenA, int songuyenB) //Phuong thuc sum2songuyen tra về int, tổng hai tham số
    {
        System.out.println("+ Số Nguyên A là : "+songuyenA);
        System.out.println("+ Số Nguyên B là: "+songuyenB);
        return songuyenA+songuyenB; // phương thức kết thúc khi gặp return
    }
    public static double tich2SoThuc(float sothucA, float sothucB){
        System.out.println("+ Số Thực A là : "+sothucA);
        System.out.println("+ Số Thực B là: "+sothucB);
        return  sothucA*sothucB;
    }
    public static void main(String[] args) {
        System.out.println("Tổng hai số nguyên là: "+sum2SoNguyen(10,20)); // in tổng 2 số nguyên
        System.out.println("Tích hai số thực là: "+tich2SoThuc(5.5F,6.5F)); // in tích 2 số thực
    }
}
