
public class Main {
    public static void shellSort(int[] array) {
        int n = array.length;

        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3, 7, 1, 55, 32, 70, 80, 99, 55};

        System.out.println("Array before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        shellSort(array);

        System.out.println("\nArray after sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}