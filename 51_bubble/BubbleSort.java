// Clyde "Thluffy" Sinclair
// APCS pd0
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent:  hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 *
 * DISCO
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0:
 * q1: After pass p, what do you know?
 * a1:
 * q2: How many passes are necessary to completely sort?
 * a2:
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond:  lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();
        while( size > 0 ) {
            //     offset + rand int on interval [lo,hi]
            retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
            size--;
        }
        return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al )
    {
        int randomIndex;
        //setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static boolean isSorted (ArrayList<Comparable> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i).compareTo(data.get(i+1)) > 0) {
                return false;
            }
        }
        return true;
    }

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data )
    {
        if (data.size() <= 1) {
            return;
        }
        else {
            for (int i = 0; i < data.size() - 1; i++) {
                for (int j = data.size() - 1; j > i; j--) {
                    if (data.get(j).compareTo(data.get(j-1)) < 0) {
                        Comparable temp = data.get(j);
                        data.set(j, data.get(j-1));
                        data.set(j-1, temp);
                    }
                }
            }
            return;
        }
    }


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.

    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> data )
    {
        if (data.size() <= 1) {
            return data;
        }
        else {
            for (int i = 0; i < data.size() - 1; i++) {
                for (int j = data.size() - 1; j > i; j--) {
                    if (data.get(j).compareTo(data.get(j-1)) < 0) {
                        Comparable temp = data.get(j);
                        data.set(j, data.get(j-1));
                        data.set(j-1, temp);
                    }
                }
            }
            return data;
        }
    }

    public static void main( String [] args )
    {

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ArrayList glem = new ArrayList<Integer>();
      glem.add(7);
      glem.add(1);
      glem.add(5);
      glem.add(12);
      glem.add(3);
      System.out.println( "ArrayList glem before sorting:\n" + glem );
      ArrayList glenSorted = bubbleSort( glem );
      System.out.println( "ArrayList glem after sorting:\n" + glem );
      ArrayList coconut = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coconut before sorting:\n" + coconut );
      ArrayList cocoSorted = bubbleSort( coconut );
      System.out.println( "ArrayList coconut after sorting:\n" + coconut );


    }//end main

}//end class BubbleSort