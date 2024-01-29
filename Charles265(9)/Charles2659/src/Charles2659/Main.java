package Charles2659;
import java.util.Random;

/*
 * Name: Christoper Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #9
 * Description: Comparing Times of Sorting
 */
public class Main {
    public static void main(String[] args) {
        int[] arr= new int[50000];
        long startTime;
        long endTime;
        Shuffle(arr);

        startTime=System.nanoTime();
        BubbleSort.bubbleSort(arr);
        endTime = System.nanoTime();
        System.out.println("Time for BubbleSort(ms): "+(endTime-startTime)/1000000.0);

        Shuffle(arr);

        startTime=System.nanoTime();
        InsertionSort.insertionSort(arr);
        endTime = System.nanoTime();
        System.out.println("Time for InsertionSort(ms): "+(endTime-startTime)/1000000.0);

        Shuffle(arr);

        startTime=System.nanoTime();
        MergeSort.mergeSort(arr);
        endTime = System.nanoTime();
        System.out.println("Time for MergeSort(ms): "+(endTime-startTime)/1000000.0);

        Shuffle(arr);

        startTime=System.nanoTime();
        QuickSort.quickSort(arr);
        endTime = System.nanoTime();
        System.out.println("Time for QuickSort(ms): "+(endTime-startTime)/1000000.0);
    }
    public static void Shuffle(int[] arr)
    {
        Random rand = new Random();
        for(int i =0; i<50000;i++)
        {
            int ran = rand.nextInt(99999);
            arr[i]=ran;
        }
    }
}