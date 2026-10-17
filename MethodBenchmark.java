public class MethodBenchmark{
    static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return;
        }
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 5000};

        System.out.println("Input Size | Linear Search (ms) | Bubble Sort (ms)");

        for (int i = 0; i < sizes.length; i++) {

            int size = sizes[i];
            int[] arr1 = createArray(size);
            int[] arr2 = createArray(size);

        
            long start1 = System.nanoTime();
            linearSearch(arr1, size - 1);
            long end1 = System.nanoTime();

            
            long start2 = System.nanoTime();
            bubbleSort(arr2);
            long end2 = System.nanoTime();

            double linearTime = (end1 - start1) / 1_000_000.0;
            double bubbleTime = (end2 - start2) / 1_000_000.0;

            System.out.println(size + "        | " +
                               linearTime + "           | " +
                               bubbleTime);
        }
    }
}
