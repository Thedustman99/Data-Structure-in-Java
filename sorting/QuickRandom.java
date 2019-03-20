// In this code we will be performing Quick Sort but using random numbers, and those random numbers will be in a range 
// defined by the user..
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author sourav
 */
class apples{

    public static void main(String[] args) {
        
        System.out.println("This is a quick sort but using random numbers");
        
        Scanner scanner = new Scanner(System.in);				// Calling scanner to use it further
        Random rand = new Random();								// Using Random to create random numbers(random number generator).
        int n;
        System.out.println("Enter the length of the array you want to operate on");
        n =scanner.nextInt();									// We are using nextInt cause all the inputs are in integers.
        int[] intArray = new int[n];							// Creating an empty array which will be filled later
        int min =0;												// Both min and max are defining range, here min is lower bound
        int max = 0;											// whereas max is upper bound.
        System.out.println("Enter the range in which all number should lie");
        System.out.print("Min : --> ");
        min = scanner.nextInt();
        System.out.print("Max : --> ");        
        max = scanner.nextInt();
                
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt((max - min) + 1) + min;		// (max-min) + 1 will allow us to use it till the value of (max-min).
        }															// adding min to it will set the range. 
        
        System.out.println("This is unsorted array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        quickSort(intArray, 0, intArray.length);
        
        System.out.println("This is sorted array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // This empty loop is iterating from right to left            
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }
            // This empty loop is iterating from left to right            
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }

}
