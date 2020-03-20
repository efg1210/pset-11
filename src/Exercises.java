import java.util.ArrayList;

public class Exercises {

    public int findMe(int[] list, int target) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int findMe(ArrayList<String> list, String target) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public int findMeFaster(ArrayList<Integer> list, int target) {
        if (list == null) {
            return -1;
        }

        int start = 0;
        int end = list.size() - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;

            if (list.get(middle) < target) {
                start = middle + 1;
            } else if (list.get(middle) > target) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public int findMeFaster(String[] list, String target) {
        if (list == null) {
            return -1;
        }

        int start = 0;
        int end = list.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;

            if (list[middle].compareTo(target) < 0) {
                start = middle + 1;
            } else if (list[middle].compareTo(target) > 0) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public int[] bubble(int[] list, boolean ascending) {
        if (list == null) {
            return null;
        }
        if (ascending) {
            int lastIndex = list.length - 1;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < lastIndex; i++) {
                    if (list[i] > list[i + 1]) {
                        int temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        swapped = true;
                    }
                }
                lastIndex--;
            }
        } else {
            int lastIndex = list.length - 1;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < lastIndex; i++) {
                    if (list[i] < list[i + 1]) {
                        int temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        swapped = true;
                    }
                }
                lastIndex--;
            }
        }
        return list;
    }

    public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
        if (list == null) {
            return null;
        }

        int nullCounter = 0;
        for (String each: list) {
            if (each == null) {
                nullCounter++;
            }
        }

        if (ascending) {
            int lastIndex = list.size() - 1;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < lastIndex; i++) {
                    if (list.get(i) == null) {
                        list.add(list.remove(i));
                    } else {
                        if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                            String temp = list.get(i);
                            list.set(i, list.get(i + 1));
                            list.set(i + 1, temp);
                            swapped = true;
                        }
                    }
                }
                lastIndex--;
            }
        } else {
            int lastIndex = list.size() - 1;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < lastIndex; i++) {
                    if (list.get(i) == null) {
                        list.add(list.remove(i));
                    } else {
                        if (list.get(i).compareTo(list.get(i + 1)) < 0) {
                            String temp = list.get(i);
                            list.set(i, list.get(i + 1));
                            list.set(i + 1, temp);
                            swapped = true;
                        }
                    }
                }
                lastIndex--;
            }
        }

        for (int i = 0; i < nullCounter; i++) {
            list.add(null);
        }

        return list;
    }

    public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
        if (list == null) {
            return null;
        }

        int nullCounter = 0;
        ArrayList<Integer> goodList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                nullCounter++;
            } else {
                goodList.add(list.get(i));
            }
        }

        if (ascending) {
            int i = 0; 
            while (i < goodList.size()) {
                int j = i;
                while (j > 0 && goodList.get(j - 1) > goodList.get(j)) {
                    int temp = goodList.get(j - 1);
                    goodList.set((j - 1), goodList.get(j));
                    goodList.set(j , temp);
                    j--;
                }
                i++;
            }
        } else {
            int i = 0; 
            while (i < goodList.size()) {
                int j = i;
                while (j > 0 && goodList.get(j - 1) < goodList.get(j)) {
                    int temp = goodList.get(j - 1);
                    goodList.set((j - 1), goodList.get(j));
                    goodList.set(j , temp);
                    j--;
                }
                i++;
            }
        }

        for (int i = 0; i < nullCounter; i++) {
            goodList.add(null);
        }

        return goodList;
    }

    public String[] insertion(String[] list, boolean ascending) {
        if (list == null) {
            return null;
        }
        if (ascending) {
            int i = 0; 
            while (i < list.length) {
                int j = i;
                while (j > 0 && list[j - 1].compareTo(list[j]) > 0) {
                    String temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    j--;
                }
                i++;
            }
        } else {
            int i = 0; 
            while (i < list.length) {
                int j = i;
                while (j > 0 && list[j - 1].compareTo(list[j]) < 0) {
                    String temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    j--;
                }
                i++;
            }
        }
        return list;
    }

    public int[] selection(int[] list, boolean ascending) {
        if (list == null) {
            return null;
        }
        if (ascending) {
            int i = 0;
            int end = list.length;
            while (i < end) {
                int minIndex = i;
                for (int j = i; j < end; j++) {
                    if (list[minIndex] > list[j]) {
                        minIndex = j;
                    }
                }
                int temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
                i++;
            }
        } else {
            int i = 0;
            int end = list.length;
            while (i < end) {
                int minIndex = i;
                for (int j = i; j < end; j++) {
                    if (list[minIndex] < list[j]) {
                        minIndex = j;
                    }
                }
                int temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
                i++;
            }
        }
        return list;
    }

    public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
        if (list == null) {
            return null;
        }

        int nullCounter = 0;
        for (String each: list) {
            if (each == null) {
                nullCounter++;
            }
        }

        if (ascending) {
            int i = 0;
            int end = list.size();
            while (i < end) {
                int minIndex = i;
                for (int j = i; j < end; j++) {
                    if (list.get(minIndex).compareTo(list.get(j)) > 0) {
                        minIndex = j;
                    }
                }
                String temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
                i++;
            }
        } else {
            int i = 0;
            int end = list.size();
            while (i < end) {
                int minIndex = i;
                for (int j = i; j < end; j++) {
                    if (list.get(minIndex).compareTo(list.get(j)) < 0) {
                        minIndex = j;
                    }
                }
                String temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
                i++;
            }
        }

        for (int i = 0; i < nullCounter; i++) {
            list.add(null);
        }

        return list;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {        
        if (list == null) {
            return null;
        }

        if (list.size() == 1) {
            return list;
        }

        int nullCounter = 0;
        ArrayList<Integer> goodList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                nullCounter++;
            } else {
                goodList.add(list.get(i));
            }
        }

        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();

        //System.out.println("list size: " + list.size());

        for (int i = 0; i < (goodList.size()/2); i++) {
            firstList.add(goodList.get(i));
        }
        for (int i = (goodList.size()/2); i < goodList.size(); i++) {
            secondList.add(goodList.get(i));
        }

        ArrayList<Integer> combined = combine(merge(firstList, ascending), merge(secondList, ascending), ascending);

        for (int i = 0; i < nullCounter; i++) {
            combined.add(null);
        }
        
        return combined;
    }

    public ArrayList<Integer> combine(ArrayList<Integer> firstList, ArrayList<Integer> secondList, boolean ascending) {
        ArrayList<Integer> combination = new ArrayList<Integer>();
        int firstLocation = 0;
        int secondLocation = 0;
      
        while (firstLocation < firstList.size() && secondLocation < secondList.size()) {
            
            // System.out.println("firstList.get(firstLocation): " + firstList.get(firstLocation));
            // System.out.println("secondList.get(secondLocation): " + secondList.get(secondLocation));
            
            if (firstList.get(firstLocation) < secondList.get(secondLocation)) {
                combination.add(firstList.get(firstLocation));
                firstLocation++;
            } else {
                combination.add(secondList.get(secondLocation));
                secondLocation++;
            }
        }

        if (firstLocation == firstList.size()) {
            combination.add(secondList.get(secondLocation));
        }

        if (secondLocation == secondList.size()) {
            combination.add(firstList.get(firstLocation));
        }

        // System.out.println("add: " + (firstList.size() + secondList.size()));
        // System.out.println("actual: " + combination.size());

        return combination;
    }

    public String[] merge(String[] list, boolean ascending) {
        if (list == null) {
            return null;
        }
        return null;
    }

    private boolean hasNull(String[] strings) {
        for (String string: strings) {
            if (string == null) {
                return true;
            }
        }
        return false;
    }
}