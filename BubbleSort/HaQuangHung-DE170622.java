public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, -4, 11, 90 };
        System.out.println("Unsort:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted:");
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
