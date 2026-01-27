public class Bai4 {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 7, 23};
        
        System.out.println("Trước khi sắp xếp:");
        displayBooks(arr);
        
        sortBooks(arr);
        
        System.out.println("Sau khi sắp xếp:");
        displayBooks(arr);
    }

    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán vị
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}