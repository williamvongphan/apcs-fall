
// Clyde "Thluffy" Sinclair
// APCS pd0
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent:  hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 *
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0:
 * q1: What do you know after pass p?
 * a1:
 * q2: How do you know if sorted?
 * a2:
 * q3: What does a pass boil down to?
 * a3:
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi )
    {
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
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void selectionSortV(ArrayList<Comparable> a) {
        int minIndex;
        for (int i = 0; i < a.size() - 1; i++) {
            // pass counter
            System.out.println("Pass " + (i + 1));
            minIndex = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).compareTo(a.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = a.get(i);
            a.set(i, a.get(minIndex));
            a.set(minIndex, temp);
        }
    }


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
    {
        //declare and initialize empty ArrayList for copying
        ArrayList<Comparable> data = new ArrayList<Comparable>();

        //copy input ArrayList into working ArrayList
        for( Comparable o : input )
            data.add( o );

        //sort working ArrayList
        selectionSortV( data );

        return data;
    }//end selectionSort


    public static void main( String [] args )
    {

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );

      ArrayList chris = new ArrayList<Integer>();
      chris.add(7);
      chris.add(1);
      chris.add(5);
      chris.add(12);
      chris.add(3);
      System.out.println( "ArrayList chris before sorting:\n" + chris );
      ArrayList chrisSorted = selectionSort( chris );
      System.out.println( "ArrayList chris after sorting:\n" + chrisSorted );
      ArrayList nick = populate( 10, 1, 1000 );
      System.out.println( "ArrayList nick before sorting:\n" + nick );
      ArrayList nickSorted = selectionSort( nick );
      System.out.println( "ArrayList nick after sorting:\n" + nickSorted );

    }//end main

}//end class SelectionSort