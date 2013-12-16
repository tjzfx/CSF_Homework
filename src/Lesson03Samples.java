import java.util.Arrays;

public class Lesson03Samples {

    public static void main(String args[]) {
        int[] array1 = {1, 3, 5, 11};
        int[] array2 = {2, 4, 6, 12, 40};
        int[] arrayToMergeInPlace = {1, 3, 5, 6, 9, 2, 4, 7, 8, 11};
        int[] arrayToSort = {10, 400, 12, 57, 2, 5, 8, -10, 58, 3};

        int[] sortedArray = null;


        // TODO: Set sortedArray equal to the return of one of methods
        //sortedArray = merge(array1, array2);

        sortedArray = arrayToMergeInPlace;
        mergeInPlace(arrayToMergeInPlace, 0, 5, 10);

        //sortedArray = mergeSort(arrayToSort);

        System.out.println("The sorted array: " + Arrays.toString(sortedArray));
        System.out.println(isSorted(sortedArray) ? "Sorting worked!" : "Sorting didn't work...");
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] merge(int[] array1, int[] array2) {
        // TODO: Given two sorted arrays, combine them into a merged array which has all the elements of both in sorted order.
        int counter1 = 0;
        int counter2 = 0;
        int[] mergedArr = new int[array1.length + array2.length];

        for(int i = 0; i < mergedArr.length; i++)
            if (counter1 < array1.length && counter2 < array2.length) {
                if (array1[counter1] < array2[counter2]) {
                    mergedArr[i] = array1[counter1];
                    counter1++;
                } else {
                    mergedArr[i] = array2[counter2];
                    counter2++;
                }
            }
            else if (counter1 < array1.length && counter2 == array2.length) {
                    mergedArr[i] = array1[counter1];
                    counter1++;
                }
            else if (counter1 == array1.length && counter2 < array2.length) {
                    mergedArr[i] = array2[counter2];
                    counter2++;
            }

        return mergedArr;
    }

public static void mergeInPlace(int[] array, int i, int j, int k) {
            int counterI = i;
            int counterJ = j;

            while(counterJ < array.length && counterI < counterJ){
                if(array[counterI] <= array[counterJ]){
                    counterI++;
                }
                else{
                    int bigger = array[counterI];
                    array[counterI] = array[counterJ];
                    for(int slide = counterJ; slide > counterI; slide--){
                        int swap=array[slide];
                        //array[slide - 1]=swap;

                        array[slide] = array[slide - 1];

                        array[slide - 1] = swap;
                    }
                    array[counterI + 1] = bigger;
                    counterJ++;
                }
            }

            // TODO: Assuming that the elements of array are in sorted order between array[i] and array[j-1],
            // and between array[j] and array[k-1], rearrange the array to put the elements between array[i] and
            // array[k-1] in sorted order.
        }

    public static int[] mergeSort(int[] arrayToSort) {
        // TODO: Using the mergeInPlace method you just wrote, write a function to sort a given array. Remember to make a
        // copy of the original array first to avoid overwriting the original. Hint: start by sorting the smallest
        // possible subsections of the array, and combine them with mergeInPlace until the whole array is sorted.
        int[] sortedArray = null;

        return sortedArray;
    }

    public static int[] selectionSortWithComparisonCounter(int[] arrayToSort) {
        // TODO: Write an implementation of the bubble sort algorithm that keeps a count of how many times you compare
        // elements of the array (eg. array[i]<array[j]). Before returning the sorted array print the numbers of
        // comparisons used to the console.
        int[] sortedArray = null;
        return sortedArray;
    }

    public static int[] mergeSortWithComparisonCounter(int[] arrayToSort) {
        // TODO: Update your implementation of merge sort above to keep a count of comparisons. Try merge sort and bubble
        // sort with different arrays and look at the number of comparisons used. Why is merge sort more efficient?
        int[] sortedArray = null;
        return sortedArray;
    }
}