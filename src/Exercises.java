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
            middle = ((start + end) / 2);

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
        ArrayList<String> goodList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                nullCounter++;
            } else {
                goodList.add(list.get(i));
            }
        }

        if (ascending) {
            int lastIndex = goodList.size() - 1;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < lastIndex; i++) {
                    if (goodList.get(i) == null) {
                        goodList.add(goodList.remove(i));
                    } else {
                        if (goodList.get(i).compareTo(goodList.get(i + 1)) > 0) {
                            String temp = goodList.get(i);
                            goodList.set(i, goodList.get(i + 1));
                            goodList.set(i + 1, temp);
                            swapped = true;
                        }
                    }
                }
                lastIndex--;
            }
        } else {
            int lastIndex = goodList.size() - 1;
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < lastIndex; i++) {
                    if (goodList.get(i) == null) {
                        goodList.add(goodList.remove(i));
                    } else {
                        if (goodList.get(i).compareTo(goodList.get(i + 1)) < 0) {
                            String temp = goodList.get(i);
                            goodList.set(i, goodList.get(i + 1));
                            goodList.set(i + 1, temp);
                            swapped = true;
                        }
                    }
                }
                lastIndex--;
            }
        }

        for (int i = 0; i < nullCounter; i++) {
            goodList.add(null);
        }

        return goodList;
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
        ArrayList<String> goodList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                nullCounter++;
            } else {
                goodList.add(list.get(i));
            }
        }

        if (ascending) {
            int i = 0;
            int end = goodList.size();
            while (i < end) {
                int minIndex = i;
                for (int j = i; j < end; j++) {
                    if (goodList.get(minIndex).compareTo(goodList.get(j)) > 0) {
                        minIndex = j;
                    }
                }
                String temp = goodList.get(minIndex);
                goodList.set(minIndex, goodList.get(i));
                goodList.set(i, temp);
                i++;
            }
        } else {
            int i = 0;
            int end = goodList.size();
            while (i < end) {
                int minIndex = i;
                for (int j = i; j < end; j++) {
                    if (goodList.get(minIndex).compareTo(goodList.get(j)) < 0) {
                        minIndex = j;
                    }
                }
                String temp = goodList.get(minIndex);
                goodList.set(minIndex, goodList.get(i));
                goodList.set(i, temp);
                i++;
            }
        }

        for (int i = 0; i < nullCounter; i++) {
            goodList.add(null);
        }

        return goodList;
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
            if (ascending) {
                if (firstList.get(firstLocation) < secondList.get(secondLocation)) {
                    combination.add(firstList.get(firstLocation));
                    firstLocation++;
                } else {
                    combination.add(secondList.get(secondLocation));
                    secondLocation++;
                }
            } else {
                if (firstList.get(firstLocation) > secondList.get(secondLocation)) {
                    combination.add(firstList.get(firstLocation));
                    firstLocation++;
                } else {
                    combination.add(secondList.get(secondLocation));
                    secondLocation++;
                }
            }
        }        

        while (firstLocation == firstList.size() && secondLocation != secondList.size()) {
            combination.add(secondList.get(secondLocation));
            secondLocation++;
        }

        while (secondLocation == secondList.size() && firstLocation != firstList.size()) {
            combination.add(firstList.get(firstLocation));
            firstLocation++;
        }

        return combination;
    }

    public String[] merge(String[] list, boolean ascending) {
        if (list == null) {
            return null;
        }

        if (list.length == 1) {
            return list;
        }

        String[] firstList = new String[list.length/2];
        String[] secondList = new String[(list.length - (list.length/2))];

        for (int i = 0; i < (list.length/2); i++) {
            firstList[i] = list[i];
        }
        for (int i = 0; i < secondList.length; i++) {
            secondList[i] = list[i + (list.length/2)];
        }

        String[] combined = combine(merge(firstList, ascending), merge(secondList, ascending), ascending);
        return combined;
    }

    public String[] combine(String[] firstList, String[] secondList, boolean ascending) {
        String[] combination = new String[firstList.length + secondList.length];
        int firstLocation = 0;
        int secondLocation = 0;
        int combineLocation = 0;
      
        while (firstLocation < firstList.length && secondLocation < secondList.length) {
            if (ascending) {
                if (firstList[firstLocation].compareTo(secondList[secondLocation]) < 0) {
                    combination[combineLocation] = firstList[firstLocation];
                    firstLocation++;
                    combineLocation++;
                } else {
                    combination[combineLocation] = secondList[secondLocation];
                    secondLocation++;
                    combineLocation++;
                }
            } else {
                if (firstList[firstLocation].compareTo(secondList[secondLocation]) > 0) {
                    combination[combineLocation] = firstList[firstLocation];
                    firstLocation++;
                    combineLocation++;
                } else {
                    combination[combineLocation] = secondList[secondLocation];
                    secondLocation++;
                    combineLocation++;
                }
            }
        }        

        while (firstLocation == firstList.length && secondLocation != secondList.length) {
            combination[combineLocation] = secondList[secondLocation];
            secondLocation++;
            combineLocation++;
        }

        while (secondLocation == secondList.length && firstLocation != firstList.length) {
            combination[combineLocation] = firstList[firstLocation];
            firstLocation++;
            combineLocation++;
        }

        return combination;
    }
}