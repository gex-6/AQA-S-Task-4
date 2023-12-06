import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        drawDiamond();
        System.out.println();
        int[] intArray = {31, 432, 3, 42, 51, 999, -1};
        bubbleSort(intArray);
        System.out.print(Arrays.toString(intArray));
        System.out.println();
        int[] intArray2 = {31, 432, 3, 42, 51, 999, -1};
        insertionSort(intArray2);
        System.out.println(Arrays.toString(intArray2));
    }

    /**
     * TASK 1-ext: diamond
     */
    public static void drawDiamond() {

        int k = 6;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k - i; j++) {
                System.out.print(" ");
            }
            int p = 1;
            while (p <= 2 * i -1) {
                System.out.print("*");
                p++;
            }
            System.out.println();
        }

        k = 11;
        for (int i = 1; i < 6; i++) {
            k--;
            for (int j = 0; j < 10; j++) {
                if (j >= i && j < k) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Task 2: Bubble sort
     */
    public static void bubbleSort(int[] intArray) {
        int temp;
        for (boolean flag = true; flag; ) {
            flag = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    /**
     * Task 2-ext: Insertion sort
     */
    public static void insertionSort(int[] intArray) {

        for (int i = 1; i < intArray.length; i++) {

            int temp = intArray[i];
            int j = i - 1;

            while (j >= 0 && intArray[j] > temp) {
                intArray[j + 1] = intArray[j];
                j = j - 1;
            }
            intArray[j + 1] = temp;
        }
    }
}