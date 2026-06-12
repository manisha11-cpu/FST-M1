package activity1;
public class Activity4 {
   public static void insertionSort(int[] arr) {
       for (int i = 1; i < arr.length; i++) {
           int key = arr[i];
           int j = i - 1;
           while (j >= 0 && arr[j] > key) {
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j + 1] = key;
       }
   }
   public static void main(String[] args) {
       int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6};
       System.out.println("Before Sorting:");
       for (int num : numbers) {
           System.out.print(num + " ");
       }
       insertionSort(numbers);
       System.out.println("\nAfter Sorting:");
       for (int num : numbers) {
           System.out.print(num + " ");
       }
   }
}
