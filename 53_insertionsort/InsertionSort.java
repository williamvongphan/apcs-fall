// Clyde "Thluffy" Sinclair
// APCS pd0
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent:  hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
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
 * q2: How will you know when sorted?
 * a2:
 * q3: What constitues a pass?
 * a3:
 * q4: What must you track?
 * a4: 
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
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
    public static void shuffle( ArrayList al ) {
        int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    public static void insertionSortV( ArrayList<Comparable> data )
    {
        int partition = 0;
        for( int i = 1; i < data.size(); i++ ) {
            //partition marks first item in unsorted region
            partition = i;
            // System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
            // System.out.println( data );

            //traverse sorted region from right to left
            for( int j = i; j > 0; j-- ) {

                // "walk" the current item to where it belongs
                // by swapping adjacent items
                if ( data.get( j ).compareTo( data.get( j-1 ) ) < 0 ) {

                    // System.out.println( "swap indices "+(j-1)+" & "+j+"..." ); //diag
                    data.set( j, data.set( j-1, data.get( j ) ) );
                }
                else
                    break;
            }
        }
    }//end insertionSortV


    // ArrayList-returning insertionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input )
    {
        //declare and initialize empty ArrayList for copying
        ArrayList<Comparable> data = new ArrayList<Comparable>();

        //copy input ArrayList into working ArrayList
        for( Comparable o : input )
            data.add( o );

        //sort working ArrayList
        insertionSortV( data );

        //return working ArrayList
        return data;
    }//end insertionSort


    public static void main( String [] args )
    {
        ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        insertionSortV(glen);
        System.out.println( "ArrayList glen after sorting:\n" + glen );
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        insertionSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );

        ArrayList chris = new ArrayList<Integer>();
        chris.add(7);
        chris.add(1);
        chris.add(5);
        chris.add(12);
        chris.add(3);
        System.out.println( "ArrayList chris before sorting:\n" + chris );
        ArrayList chrisSorted = insertionSort( chris );
        System.out.println( "ArrayList chris after sorting:\n" + chrisSorted );
        ArrayList nick = populate( 10, 1, 1000 );
        System.out.println( "ArrayList nick before sorting:\n" + nick );
        ArrayList nickSorted = insertionSort( nick );
        System.out.println( "ArrayList nick after sorting:\n" + nickSorted );

    }//end main

}//end class InsertionSort