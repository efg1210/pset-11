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
        return list;
    }

    public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
        if (list == null) {
            return null;
        }
        if (ascending) {
            int i = 0; 
            while (i < list.size()) {
                int j = i;
                while (j > 0 && list.get(j - 1) > list.get(j)) {
                    int temp = list.get(j - 1);
                    list.set((j - 1), list.get(j));
                    list.set(j , temp);
                    j--;
                }
                i++;
            }
        } else {
            int i = 0; 
            while (i < list.size()) {
                int j = i;
                while (j > 0 && list.get(j - 1) < list.get(j)) {
                    int temp = list.get(j - 1);
                    list.set((j - 1), list.get(j));
                    list.set(j , temp);
                    j--;
                }
                i++;
            }
        }
        return list;
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
        return null;
    }

    public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
        if (list == null) {
            return null;
        }
        return null;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
        if (list == null) {
            return null;
        }
        return null;
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