package com.greenfoxacademy;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

  // Complete the birthdayCakeCandles function below.
  static int birthdayCakeCandles(int[] ar) {
    HashMap<Integer, Integer> candleFrequency = new HashMap<>();
    for (int i = 0; i < ar.length; i++){
      if (candleFrequency.containsKey(ar[i])){
        candleFrequency.put(ar[i], candleFrequency.get(ar[i]) + 1);
      } else {
        candleFrequency.put(ar[i], 1);
      }
    }
    ArrayList<Integer> keysOfHashMap = new ArrayList<>(candleFrequency.keySet());
    Collections.sort(keysOfHashMap);
    int largestCandle = keysOfHashMap.get(keysOfHashMap.size() - 1);
    return candleFrequency.get(largestCandle);

  }

  static String timeConversion(String s) throws ParseException {
    //sample input: 07:05:45PM
    DateFormat amPMformat = new SimpleDateFormat("hh:mm:ssa", Locale.US);
    DateFormat militaryFormat = new SimpleDateFormat("HH:mm:ss");
    Date input = null;
    input = amPMformat.parse(s);
    String result = militaryFormat.format(input);

  return result;
  }

  public static void main(String[] args) throws IOException {

  }
}

