/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// Clyde "Thluffy" Sinclair
// APCS pd0
// HW40 -- 2D arrays
// 2021-11-30

public class TwoDimArray
{
    // From 34_loopier
    public static String toString (int[] array) {
        String ans = "[";
        int l = array.length;
        for (int x = 0; x < l; x++) {
            int b = array[x];
            ans += Integer.toString(b);
            if (!(x == l - 1)) {
                ans += ", ";
            }
        }
        ans += "]";
        return ans;
    }

    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a )
    {
        for (int x = 0; x < a.length; x++) {
            System.out.println(toString(a[x]));
        }
    }


    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a )
    {
        for (int[] ax : a) {
            String v = "[";
            for (int x : ax) {
                v += x + ", ";
            }
            // truncate the extra space from the array
            v = v.substring(0, v.length() - 2) + "]";
            System.out.println(v);
        }
    }


    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a )
    {
        int b = 0;
        for (int[] ax : a) {
            for (int x : ax) {
                b += x;
            }
        }
        return b;
    }


    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow


    public static int sum2( int [][] a )
    {
        int c = 0;
        for (int x = 0; x < a.length; x++) {
            c += sumRow(x, a);
        }
        return c;
    }


    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOR loop
    //

    // returns sum of all items on row r of 2D int array a, uses a FOR loop
    public static int sumRow( int r, int[][] a )
    {
        int b = 0;
        for (int x = 0; x < a[r].length; x++) {
            b += x;
        }
        return b;
    }



    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] a)
    {
        int b = 0;
        for (int x : a[r]) {
            b += x;
        }
        return b;
    }


    public static void main( String [] args )
    {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));

        // your own custom test cases welcomed and encouraged
    }

}//end class TwoDimArray
