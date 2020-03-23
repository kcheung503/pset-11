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

    boolean isFound = false;
    int start = 0;
    int end = list.length;

    while (!isFound) {
      int midpoint = (start + end) / 2;

    if (list[midpoint].equals(target)) {
        return midpoint;
      } else if (list[midpoint].compareTo(target) < 0) {
        end = midpoint;
      } else if (list[midpoint].compareTo(target) > 0) {
        start = midpoint;
      }

    }


    return -1;
  }

//Exercise 5
  public int[] bubble(int[] list, boolean ascending) {
    if (list == null || list.length == 0) {
      return null;
    }

    int[] arr = list;

    if (ascending) {
      for (int i = 0; i < arr.length -1; i++) {
        for (int j = 0; j < arr.length -1 -i; j++) {
          if (arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
    } else if (!ascending) {
    for (int i = arr.length; i > 1; i--) {
      for (int j = arr.length; j > i - 1; j--) {
        if (arr[j] > arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }

  return arr;
}


//Exercise 6
  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    if (list == null || list.size() == 0) {
      return null;
    }

    ArrayList<String> arr = list;

    if (ascending) {
      for (int i = 0; i < arr.size() -1; i++) {
        for (int j = 0; j < arr.size() - 1 - i; j++) {
          if (arr.get(j).compareTo(arr.get(j+1)) > 0) {
            String temp = arr.get(j);
            arr.set(j, arr.get(j+1));
            arr.set(j+1, temp);
          }
        }
      }
    } else if (!ascending) {
          for (int i = arr.size(); i > 1; i--) {
            for (int j = arr.size(); j > i - 1; j--) {
              if (arr.get(j).compareTo(arr.get(j-1)) > 0) {
                String temp = arr.get(j);
                arr.set(j, arr.get(j - 1));
                arr.set(j - 1, temp);
              }
            }
          }
        }

        return arr;
      }

//Exercise 7
  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    if (list == null || list.size() == 0) {
      return null;
    }

    ArrayList<Integer> arr = list;

    if (ascending) {
      for (int i = 1; i < arr.size(); i++) {
        boolean isSorted = false;

        while (!isSorted) {
          for (int j = i; j >= 0; j--) {
            if (arr.get(i) < arr.get(j)) {
              int saved = arr.get(i);
              for (int k = i-1; k > j; k--) {
                int temp = arr.get(k);
                arr.set(k, arr.get(k-1));
                arr.set(k+1, temp);
              }
              arr.set(j, saved);
              isSorted = true;
              break;
            }
          }
        }
      }
    } else if (!ascending) {
          for (int i = 1; i < arr.size(); i++) {
            boolean isSorted = false;

            while (!isSorted) {
              for (int j = i; j >= 0; j--) {
                if (arr.get(i) > arr.get(j)) {
                  int saved = arr.get(i);
                  for (int k = i - 1; k > j; k--) {
                    int temp = arr.get(k);
                    arr.set(k, arr.get(k - 1));
                    arr.set(k + 1, temp);
                  }
                  arr.set(j, saved);
                }
                isSorted = true;
                break;
              }
            }
          }
        }

        return null;
      }

//Exercise 8
  public String[] insertion(String[] list, boolean ascending) {
    if (list == null || list.length == 0) {
      return null;
    }

    String[] arr = list;

    if (ascending) {
      for (int i = 1; i < arr.length; i++) {
        boolean isSorted = false;

        while (!isSorted) {
          for (int j = i; j >= 0; j--) {
            if (arr[i].compareTo(arr[j]) < 0) {
              int saved = arr[i];
              for (int k = i - 1; k > j; k--) {
                int temp = arr[k];
                arr[k] = arr[k-1];
                arr[k+1] = temp;
              }
              arr[j] = saved;
              isSorted = true;
              break;
            }
          }
        }
      }
    } else if (!ascending) {
    for (int i = 1; i < arr.length; i++) {
      boolean isSorted = false;

      while (!isSorted) {
        for (int j = i; j >= 0; j--) {
          if (arr[i].compareTo(arr[j]) > 0) {
            int saved = arr[i];
            for (int k = i - 1; k > j; k--) {
              int temp = arr[k];
              arr[k] = arr[k-1];
              arr[k+1] = temp;
            }
            arr[j] = saved;
          }
          isSorted = true;
          break;
        }
      }
    }
  }

  return arr;
}

//Exercise 9
  public int[] selection(int[] list, boolean ascending) {
    if (list == null || list.length == 0) {
      return null;
    }

    int[] arr = list;

    if (ascending) {
      for (int i = 0; i < arr.length; i++) {
        int marker = i;
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] < arr[min]) {
            min = j;
          }
        }
        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }
    } else if (!ascending) {
    for (int i = 0; i < arr.length; i++) {
      int marker = i;
      int max = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[max]) {
          max = j;
        }
      }
      temp = arr[max];
      arr[max] = arr[i];
      arr[i] = temp;
    }
  }

  return null;
}

//Exercise 10
  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    if (list == null || list.size() == 0) {
      return null;
    }

    ArrayList<String> arr = list;

    if (ascending) {
      for (int i = 0; i < arr.size(); i++) {
        int marker = i;
        int min = i;
        for (int j = i + 1; j < arr.size(); j++) {
          if (arr.get(j).compareTo(arr.get(min)) < 0) {
            min = j;
          }
        }
        temp = arr.get(min);
        arr.set(min, arr.get(i));
        arr.set(i, temp);
      }
    } else if (!ascending) {
          for (int i = 0; i < arr.size(); i++) {
            int marker = i;
            int max = i;
            for (int j = i + 1; j < arr.size(); j++) {
              if (arr.get(j).compareTo(arr.get(max)) > 0) {
                max = j;
              }
            }
            temp = arr.get(max);
            arr.set(max, arr.get(i));
            arr.set(i, temp);
          }
        }

        return null;
      }

//Exercise 11
  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    if (list.contains(null) || list == null) {
          return null;
      }

      ArrayList < Integer > left = new ArrayList < Integer > ();
      ArrayList < Integer > right = new ArrayList < Integer > ();
      int center;

      if (list.size() == 1) {
          return list;
      } else {
          center = list.size() / 2;
          for (int i = 0; i < center; i++) {
              left.add(list.get(i));
          }

          for (int i = center; i < list.size(); i++) {
              right.add(list.get(i));
          }

          left = merge(left, true);
          right = merge(right, true);
          combineHalves(left, right, list);
      }
      if (!ascending) {
          Collections.reverse(list);
      }
      return list;
  }

//Exercise 12
  public String[] merge(String[] list, boolean ascending) {
    if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
          String[] temp = new String[0];
          return temp;
      }

      if (list.length >= 2) {
          String[] left = new String[list.length / 2];
          String[] right = new String[list.length - list.length / 2];

          for (int i = 0; i < left.length; i++) {
              left[i] = list[i];
          }
          for (int i = 0; i < right.length; i++) {
              right[i] = list[i + list.length / 2];
          }

          merge(left, true);
          merge(right, true);
          combine(list, left, right);
      }

      if (!ascending) {
          int i;
          String t;
          int x = list.length;
          for (i = 0; i < x / 2; i++) {
              t = list[i];
              list[i] = list[x - i - 1];
              list[x - i - 1] = t;
          }
      }
      return list;
  }

  private void combineHalves(ArrayList < Integer > left, ArrayList < Integer > right, ArrayList < Integer > complete) {
        int leftIndex = 0;
        int rightIndex = 0;
        int completeArrayIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                complete.set(completeArrayIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                complete.set(completeArrayIndex, right.get(rightIndex));
                rightIndex++;
            }
            completeArrayIndex++;
        }
        ArrayList < Integer > rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        for (int i = restIndex; i < rest.size(); i++) {
            complete.set(completeArrayIndex, rest.get(i));
            completeArrayIndex++;
        }
    }

    private static void combine(String[] list, String[] left, String[] right) {
          int a = 0;
          int b = 0;
          for (int i = 0; i < list.length; i++) {
              if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                  list[i] = left[a];
                  a++;
              } else {
                  list[i] = right[b];
                  b++;
              }
          }
      }
    }
