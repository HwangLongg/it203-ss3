import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String[] books = {"Dế Mèn Phiêu Lưu Ký", "Đắc Nhân Tâm", "Nhà Giả Kim", "Lược Sử Thời Gian", "Mắt Biếc"};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();
        
        int index = searchBooks(books, search);
        if (index != -1) {
            System.out.println("Tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) { 
                return i;
            }
        }
        return -1;
    }
}