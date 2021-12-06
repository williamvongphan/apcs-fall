public class Superarray {
    int[] _data;

    public Superarray (int[] array) {
        _data = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            _data[i] = array[i];
        }
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

    public void clear() {
        for (int i = 0; i < _data.length; i++) {
            _data[i] = 0;
        }
    }

    public void remove(int index) {
        for (int i = index; i < _data.length - 1; i++) {
            _data[i] = _data[i + 1];
        }
        int[] temp = new int[_data.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = _data[i];
        }
    }

    public void add(int value) {
        int[] temp = new int[_data.length + 1];
        for (int i = 0; i < _data.length; i++) {
            temp[i] = _data[i];
        }
        temp[temp.length - 1] = value;
        _data = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Superarray superarray = new Superarray(array);
        System.out.println(superarray.length());
        System.out.println(superarray.get(0));
        superarray.set(0, 100);
        System.out.println(superarray.get(0));
        superarray.clear();
        System.out.println(superarray.get(0));
        superarray.add(100);
        System.out.println(superarray.get(0));
        superarray.remove(0);
        System.out.println(superarray.get(0));
    }
}