// Clyde "Thluffy" Sinclair
// APCS pd0
// L05 -- pulling it together
// 2022-02-03r
// time spent:  hrs


/**
   An AP-style question, for practice...

   GOAL: Write the StatPrinter class below.

   WHAT YOU NEED TO KNOW:
   The StatPrinter Object receives an
   ArrayList of nonnegative integers, then builds a frequency ArrayList in which 
   the index values are the data and the entry at the index is the frequency. 
   For example, if the received data is    2,3,2,5,1,3    then the frequency 
   list would be [0,1,2,2,0,1]. This is read as 0 zeroes, 1 one, 2 twos, 
   2 threes, 0 fours, 1 five. The size of the frequency list is the equal to 
   the maximum value of the data.

   A capability of the class is to calculate local modes from the frequency 
   list. A local mode is a value that is greater than the value at index-1 
   and greater than the value at index+1. A local mode is never at the end 
   points of the list. For example, if the frequency list is [1,2,1,4,2,3,5] 
   then the local modes are 2 and 4.

   This class is also capable of printing a histogram of the frequencies, using 
   '*'s to indicate a frequency amount. To print a histogram, the user specifies 
   the longest sequence of '*'s used and then all other values are printed in 
   proportion to this value. For example, if longest bar is 10 and the frequency 
   list is [1,2,1,4,2,3,5] then the histogram printed looks like this:

   0 : **
   1 : ****
   2 : **
   3 : ********
   4 : ****
   5 : ******
   6 : **********

   For each method, state run time efficiency using Big O notation.

   TIPS FOR AWESOME:
   * Keys to Success were so named (by Thinkeren) for a reason.
   * Look over all fxns, think a bit, decide which to tackle first.
   ( Simplest?  Prerequisites? . . . )
   * Develop 1 fxn at a time, test it, then move to next.
   * Initially, what extra code do you need to get past compiler?
   **/

import java.util.ArrayList;
import java.util.*;

public class StatPrinter
{
  // instance variable for frequencies of each integer in input ArrayList
  private ArrayList <Integer> _frequency;


  // create a frequency arraylist for the data
  public StatPrinter( ArrayList <Integer> data ) 
  {
    _frequency = new ArrayList<Integer>();
    for (Integer i = 0; i < max(data) + 1; i++) {
      _frequency.add(0);
    }
    for (Integer i = 0; i < data.size(); i = i + 1) {
      _frequency.set(data.get(i), _frequency.get(data.get(i)) + 1);
    }
  }

  // return the largest integer in the data
  public Integer max( ArrayList <Integer> data ) 
  {
    Integer max = 0;
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i) > max) {
        max = data.get(i);
      }
    }
    return max;
  }


  // Return whether the number is a local mode (i.e. the frequency of the number is greater than the frequency of the number at the index-1 and greater than the frequency of the number at the index+1)
  public boolean isLocalMode( int i ) 
  {
    for (int j = i-1; j < i+1; j++) {
      if (_frequency.get(i) > _frequency.get(j)) {
        return true;
      }
    }
    return false;
  }


  // Return the local modes of the data
  public ArrayList<Integer> getLocalModes()
  {
    ArrayList<Integer> localModes = new ArrayList<Integer>();
    for (int i = 1; i < _frequency.size()-1; i++) {
      if (isLocalMode(i)) {
        localModes.add(i);
      }
    }
    return localModes;
  }


  // Prints a histogram of the data, given the longest bar length
  public void printHistogram( int longestBar ) 
  {
    System.out.println("0 : " + repeat("*", _frequency.get(0)));
    for (int i = 1; i < _frequency.size(); i++) {
      System.out.println(i + " : " + repeat("*", (longestBar * _frequency.get(i)) / max(_frequency)));
    }
  }

  // Returns a string of the given length, filled with the given character
  // This is extra code and not part of the problem, but is required to make the code work/
  public String repeat(String c, int length) {
    String s = "";
    for (int i = 0; i < length; i++) {
      s += c;
    }
    return s;
  }
 
}//end class StatPrinter
