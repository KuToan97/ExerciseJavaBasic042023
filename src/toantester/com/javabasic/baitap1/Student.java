package toantester.com.javabasic.baitap1;

public class Student {
    // BT BIEN CUC BO
    public void sayStudent() {
        String Name="Nguyễn Văn Toàn"; //Bien cuc bo
        int Age= 27; //Bien cuc bo
        String University="UTC2"; //Bien cuc bo
        System.out.println("Họ và tên: " + Name);
        System.out.println("Có số tuổi: " + Age);
        System.out.println("Đã từng học tại: " + University);
    }

    // BT BIEN TOAN CUC
    public String Name; //  Bien toan cuc -- Gia tri  = null
    private int Age; // Bien toan cuc -- Gia tri = 0
    public String University; // Bien toan cuc -- Gia tri = null
    public Student(String Name, String University){
        this.Name=Name; //constructor -- bien toan cuc
        this.University=University;
    }
    public void setAge(int Age){

        this.Age=Age; //constructor -- bien toan cuc
    }
    public void ShowStudent(){
        System.out.println("Họ và tên: " + Name);
        System.out.println("Có số tuổi: " + Age);
        System.out.println("Đã từng học tại: " + University);

    }

    // BT BIEN STATIC
    public static String name="Toàn Tester"; // Bien static Ten
    public static int age=27; // Bien static Tuoi
    public static String university="Khóa Java Selenium của An Tester"; // Bien static DH

    public static void  main(String args[]){
        Student st= new Student("Nguyễn Văn Toàn","UTC2");
        st.setAge(27);
        st.ShowStudent(); // Show gia tri bien toan cuc
        st.sayStudent(); // Show gia tri cho bien cuc bo

        // Su dung bien static goi truc tiep
        System.out.println("Tên tôi là:" + name);
        System.out.println("Hiện tại: " + age + " tuổi");
        System.out.println("Đang học: " + university);
        // Khai báo static ở class Information và gọi lại class SinhVien
        System.out.println("Địa chỉ hiện tại:" +Information.Address);
        System.out.println("Đang công tác ở:" +Information.Company);
    }
}
