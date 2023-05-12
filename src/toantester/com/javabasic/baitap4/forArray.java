package toantester.com.javabasic.baitap4;
public class forArray {

        public static void main(String[] args) {
            // khai báo mảng
            int mang[] = new int[50];

            //Thêm giá trị mảng thông qua vòng lặp for
            for (int i = 0; i < mang.length; i++) {
                if (i % 2 == 0) {
                    mang[i] = 10; // mảng giá trị, i là tại ví trí đó
                    System.out.println("Số chẳn là: " + i);
                }
            }
            //In giá trị số chẳn thông qua vòng lặp for
            for (int i = 0; i < mang.length; i++) {
                System.out.println("Số chẳn là: " + mang[i]);
            }
        }
    }