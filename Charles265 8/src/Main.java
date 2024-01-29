/*
 * Name: Christopher Charles
 * CSU ID: 2835983
 * CIS 265: Assignment #8
 * Description: Finding Time Differences Between List Types
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Random ran = new Random();

    int ranInt = ran.nextInt(10);
    List<Integer> link = new LinkedList<>();
    List<Integer> arr = new ArrayList<>();
    for(int i =0; i<100000; i++)
    {
        link.add(ranInt);
        arr.add(ranInt);
        ranInt = ran.nextInt(10);
    }

    // arr get
    long start = System.nanoTime();
    for(int i =0; i<1000;i++)
    {
        ranInt = ran.nextInt(99000);
        arr.get(ranInt);
    }
    long end = System.nanoTime();
    System.out.println("Time for get() in ArrayList(ms): "+((end-start)/1000000.0));

    // list get
    start = System.nanoTime();
    for(int i =0; i<1000;i++)
    {
        ranInt = ran.nextInt(99999);
        link.get(ranInt);
    }
    end = System.nanoTime();
    System.out.println("Time for get() in LinkedList(ms): "+((end-start)/1000000.0));

    // arr insert
    start = System.nanoTime();
    for(int i =0; i<1000;i++)
    {
        ranInt = ran.nextInt(10);
        arr.add(0,ranInt);
    }
    end = System.nanoTime();
    System.out.println("Time for insertion in ArrayList(ms): "+((end-start)/1000000.0));

    // link insert
    start = System.nanoTime();
    for(int i =0; i<1000;i++)
    {
        ranInt = ran.nextInt(10);
        link.add(0,ranInt);
    }
    end = System.nanoTime();
    System.out.println("Time for insertion in LinkedList(ms): "+((end-start)/1000000.0));

    // arr remove
    start = System.nanoTime();
    for(int i =0; i<1000;i++)
    {
        ranInt = ran.nextInt(99999);
        arr.remove(ranInt);
    }
    end = System.nanoTime();
    System.out.println("Time for deletion in ArrayList(ms): "+((end-start)/1000000.0));

    // link remove
    start = System.nanoTime();
    for(int i =0; i<1000;i++)
    {
        ranInt = ran.nextInt(99999);
        link.remove(ranInt);
    }
    end = System.nanoTime();
    System.out.println("Time for deletion in LinkedList(ms): "+((end-start)/1000000.0));


    }

}