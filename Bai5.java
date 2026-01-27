import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        Scanner sc = new Scanner(System.in);

        while (n > 0) {
            System.out.print("Nhập mã sách muốn xóa (0 để dừng): ");
            int id = sc.nextInt();
            if (id == 0) break;

            int newN = deleteBook(books, n, id);
            if (newN == n) {
                System.out.println("Không tìm thấy mã sách!");
            } else {
                n = newN;
                System.out.println("Xóa thành công.");
            }
            
            System.out.print("Mảng hiện tại: ");
            for (int i = 0; i < n; i++) System.out.print(books[i] + " ");
            System.out.println();
        }
    }

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            return n - 1;
        }
        return n;
    }
}