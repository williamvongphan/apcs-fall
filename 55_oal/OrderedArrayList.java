import java.util.ArrayList;

/*/
 * OrderedArrayList.java
 * By: William Vongphanith, Jefford Shau, and Jacob Kirmayer
 * 01/11/22
 */

public class OrderedArrayList {
    private ArrayList<Integer> _data;

    /*
     * Constructor.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     */
    public OrderedArrayList(){
        _data = new ArrayList<Integer>();
    }

    /*
     * Inserts the value into the correct position in the list.
     * Uses the binary search algorithm.
     * Best-case performance: O(log2(n))
     * Worst-case performance: O(log2(n))
     */
    public void add(int value){
        int idx = Utils.binarySearchInsert(_data, value);
        _data.add(idx, value);
    }

    /*
     * Removes the value from the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     */
    public void remove(int index) {
        _data.remove(index);
    }

    /*
     * Returns the value at the given index.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     */
    public int get(int index) {
        return _data.get(index);
    }

    /*
     * Returns the number of elements in the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     */
    public int size() {
        return _data.size();
    }

    /*
     * Returns the index of the value in the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     */
    public int indexOf(int value) {
        return _data.indexOf(value);
    }

    /*
     * Manually set a value in the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     */
    public void set(int index, int value) {
        _data.set(index, value);
    }

    /*
     * Returns a string representation of the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     */
    public String toString(){
        String retStr = "[";
        for( int i = 0; i < _data.size(); i++ ) {
            retStr += _data.get( i );
            if( i != _data.size() - 1 )
                retStr += ", ";
        }
        retStr += "]";
        return retStr;
    }
}