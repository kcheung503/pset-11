import java.util.ArrayList;

public class Exercises {

//Exercise 1
  public int findMe(int[] list, int target) {
    if (list == null || list.length == 0) {
      return -1;
    }

    for (int i = 0; i < list.length; i++) {
      if (list[i] == target) {
        return i;
      }
    }

    return -1;
  }

//Exercise 2
  public int findMe(ArrayList<String> list, String target) {
    if (list == null || list.size() == 0 || target == null) {
      return -1;
    }

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        return i;
      }
    }

    return -1;
  }

//Exercise 3
  public int findMeFaster(ArrayList<Integer> list, int target) {
    if (list == null || list.size() == 0) {
      return -1;
    }

    boolean isFound = false;
    int start = 0;
    int end = list.size();

    while (!isFound) {
      int midpoint = (start+end)/2;

    if (list.get(midpoint) == target) {
        return midpoint;
      } else if (list.get(midpoint) < target) {
        end = midpoint;
      } else if (list.get(midpoint) > target) {
        start = midpoint;
      }

    }

    return -1;
  }

//Exercise 4
  public int findMeFaster(String[] list, String target) {
    if (list == null || list.length == 0 || target == null) {
      return -1;
    }

    
//Exercise 5
  public int[] bubble(int[] list, boolean ascending) {
    return null;
  }

//Exercise 6
  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    return null;
  }

//Exercise 7
  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

//Exercise 8
  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

//Exercise 9
  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

//Exercise 10
  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

//Exercise 11
  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

//Exercise 12nigger
  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}
