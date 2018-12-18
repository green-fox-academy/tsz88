package com.greenfoxacademy;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
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

  static int evenForest(int nodes, int edges, List<Integer> tFrom, List<Integer> tTo){
    HashMap<Integer, Integer> weighedNodes = giveWeightToEachNode(tFrom, tTo);
    weighedNodes.remove(1);
    int counter = 0;
    for (Integer key:
         weighedNodes.keySet()) {
      if (weighedNodes.get(key) % 2 == 0){
        counter++;
      }
    }
    return counter;
  }

  static HashMap<Integer, Integer> giveWeightToEachNode(List<Integer> tFrom, List<Integer> tTo){
    HashMap<Integer, Integer> nodesWithWeight = new HashMap<>();
    for (int i = 1; i <= tFrom.size() + 1; i++){
      nodesWithWeight.put(i, 1);
    }
    for (int j = 0; j < tTo.size(); j++){
      nodesWithWeight.put(tTo.get(j), nodesWithWeight.get(tTo.get(j)) + 1);
    }
    return nodesWithWeight;
  }

  public static void main(String[] args) throws IOException {

  }
}

