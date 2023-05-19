package toantester.com.javabasic.baitap5;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class CollectionArrayList {

    public static void main(String[] args) {
        //Khởi tạo ArrayList
        ArrayList<Integer> arl = new ArrayList<Integer>();
        int number = 50;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                arl.add(i);
                System.out.println("Dãy số chẵn là: " + i);
            }
        }
        // Khai báo 1 Arraylist có tên là arrayList
        ArrayList<String> arrayList = new ArrayList<>();
        // Thêm các phần tử vào
        arrayList.add("Nguyễn Văn Toàn ");
        arrayList.add("27T ");
        arrayList.add("Đang học Selenium Java tại An Tester");
        System.out.println("Thông tin cơ bản: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf(arrayList.get(i));
        }
    }
}