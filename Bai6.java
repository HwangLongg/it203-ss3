import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 3, 8, 9};

        int[] result = mergeBooks(a, b);
        System.out.println("Kho sách sau khi gộp và lọc: " + Arrays.toString(result));
    }

    public static int[] mergeBooks(int[] a, int[] b) {
       
        int[] temp = new int[a.length + b.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, temp, a.length, b.length);

       
        Arrays.sort(temp);

       
        if (temp.length == 0) return temp;
        
        int uniqueCount = 1;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) uniqueCount++;
        }

        int[] result = new int[uniqueCount];
        result[0] = temp[0];
        int j = 1;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) {
                result[j++] = temp[i];
            }
        }
        return result;
    }
}