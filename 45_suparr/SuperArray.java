// JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
// APCS pd6
// HW45 -- encapsulation (basic SuperArray functionality)
// 2021-12-07t

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray implements ListInt
{
    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
        _data = new int[ 10 ];
        _size = 0;
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
        String retStr = "[";
        for( int i = 0; i < _size; i++ ) {
            retStr += _data[ i ];
            if( i != _size - 1 )
                retStr += ", ";
        }
        retStr += "]";
        return retStr;
    }


    //double capacity of SuperArray
    private void expand()
    {
        int[] temp = new int[ _data.length * 2 ];
        _size = _data.length * 2;
        for( int i = 0; i < _data.length; i++ ) {
            temp[ i ] = _data[ i ];
        }
        _data = temp;
    }


    //accessor -- return value at specified index
    public int get( int index )
    {
        return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
        int temp = _data[index];
        _data[index] = newVal;
        _size += 1;
        return temp;
    }

    //adds an item after the last item
    public boolean add( int newVal )
    {
        int[] temp = new int[ _size + 1 ];
        for (int i = 0; i < _size; i++) {
            temp[i] = _data[i];
        }
        temp[temp.length - 1] = newVal;
        _data = temp;
        _size += 1;
        return true;
    }


    //inserts an item at index
    public void add( int index, int newVal )
    {
        int[] temp = new int[ _data.length + 1 ];
        for (int i = 0; i < index; i++) {
            temp[i] = _data[i];
        }
        temp[index] = newVal;
        for (int i = index; i < _size; i++) {
            temp[i + 1] = _data[i];
        }
        _data = temp;
        _size += 1;
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove( int index )
    {
        int[] temp = new int[ _data.length - 1 ];
        for (int i = 0; i < index; i++) {
            temp[i] = _data[i];
        }
        for (int i = index; i < _data.length - 1; i++) {
            temp[i] = _data[i + 1];
        }
        _data = temp;
        _size -= 1;
    }


    //return number of meaningful items in _data
    public int size()
    {
        return _size;
    }


    //main method for testing
    public static void main( String[] args )
    {
        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );
        for( int i = 0; i < curtis._data.length; i++ ) {
            curtis.set( i, i * 2 );
        }
        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);
        for( int i = 0; i < 3; i++ ) {
            curtis.expand();
            System.out.println("Printing expanded SuperArray curtis...");
            System.out.println(curtis);
            System.out.println("new length of underlying array: "
                    + curtis._data.length );
        }
        SuperArray mayfield = new SuperArray();
        System.out.println("Printing empty SuperArray mayfield...");
        System.out.println(mayfield);
        mayfield.add(5);
        mayfield.add(4);
        mayfield.add(3);
        mayfield.add(2);
        mayfield.add(1);
        System.out.println("Printing populated SuperArray mayfield...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.add(3,99);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(2,88);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(1,77);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
    }//end main()


}//end class
