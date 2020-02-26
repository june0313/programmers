package testdome.sorted_search;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {

        int start = 0;
        int end = sortedArray.length - 1;

        while (true) {
            if (start > end) {
                return start;
            }

            int mid = (start + end) / 2;

            if (sortedArray[mid] == lessThan) {
                return mid;
            }

            if (sortedArray[mid] < lessThan) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 4, 5, 7}, 4));
    }
}
