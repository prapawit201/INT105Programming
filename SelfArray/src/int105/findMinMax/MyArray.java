package int105.findMinMax;

public class MyArray {

    public static void main(String[] args) {
        int[] score = {100, 50, 60, 20, 80};
//        System.out.println("min : " + findMin(score));
//        System.out.println("max : " + findMax(score));
          System.out.println("min max : " + findMinMax(score)[0] + ", " + findMinMax(score)[0]);
    }

    public static int[] findMinMax(int[] score) {
        int min = score[0];
        int max = score[0];
        for (int i : score) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        if (max > 100 || min < 0) {
            return null;
        }
        return new int[]{min, max};

    }

    public static int findMin(int[] score) {
        int min = score[0];
        for (int i : score) {
            if (min > i) {
                min = i;
            }
        }
        return min;

    }

    public static int findMax(int[] score) {
        int max = score[0];
        for (int i : score) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

}
