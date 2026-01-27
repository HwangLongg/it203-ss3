public class Bai3 {
    public static void main(String[] args) {
        String[] names = {"Toán", "Văn", "Anh", "Lý", "Hóa"};
        int[] quantities = {10, 5, 15, 15, 3};

        System.out.println("--- Thống kê ---");
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int q : quantities) if (q > max) max = q;

        System.out.print("Sách có số lượng nhiều nhất (" + max + "): ");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) System.out.print(names[i] + " ");
        }
        System.out.println();
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int q : quantities) if (q < min) min = q;

        System.out.print("Sách có số lượng ít nhất (" + min + "): ");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}