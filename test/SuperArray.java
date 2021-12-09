public class SuperArray {
    int[] _data;
    int _size = 0;

    public SuperArray () {
        _data = new int[10];
    }

    public int length() {
        return _data.length;
    }

    public int get(int index) {
        return _data[index];
    }

    public void set(int index, int value) {
        _data[index] = value;
    }


    public void remove(int index) {
        for (int i = index; i < _data.length - 1; i++) {
            _data[i] = _data[i + 1];
        }
        _data[_size-1] = 0;
        _size--;
    }

    public void expand(){
        int[] temp = new int[_data.length*2];
        for (int i = 0; i < _data.length; i++) {
            temp[i] = _data[i];
        }
        _data = temp;
        _size*=2;
    }

    public void add(int value) {
        _data[_size]=value;
        _size++;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i<_size;i++){
            res+=_data[i];
            res+=",";
        }
        return res;
    }

    public void add( int index, int newVal ){
        for (int i = _size-1;i>=index;i--){
            _data[i+1] = _data[i];
        }
        _data[index] = newVal;
        _size++;
    }

    public static void main(String[] args) {

        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );
        for( int i = 0; i < curtis._data.length; i++ ) {
            curtis.set( i, i * 2 );
        }
        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis.toString());
        for( int i = 0; i < 3; i++ ) {
            curtis.expand();
            System.out.println("Printing expanded SuperArray curtis...");
            System.out.println(curtis.toString());
            System.out.println("new length of underlying array: "
                    + curtis._data.length );
        }
        SuperArray mayfield = new SuperArray();
        System.out.println("Printing empty SuperArray mayfield...");
        System.out.println(mayfield.toString());
        mayfield.add(5);
        mayfield.add(4);
        mayfield.add(3);
        mayfield.add(2);
        mayfield.add(1);
        System.out.println("Printing populated SuperArray mayfield...");
        System.out.println(mayfield.toString());
        mayfield.remove(3);

        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield.toString());
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield.toString());
        mayfield.add(3,99);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield.toString());
        mayfield.add(2,88);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield.toString());
        mayfield.add(1,77);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield.toString());
    }
}