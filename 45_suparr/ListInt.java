public interface ListInt {
    public int _size = 0;
    public int[] _data = new int[10];

    public boolean add(int i);
    public int get(int i);
    public int set(int index, int x);
    public int size();
}