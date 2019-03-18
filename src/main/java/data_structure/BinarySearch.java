package data_structure;

class BinarySearch {

    int start(int[] numbers, int searchNo) {
        int first = 0;
        int last = numbers.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (numbers[mid] == searchNo) {
                return mid;
            } else if (numbers[mid] > searchNo) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] numbers, int first, int last, int target) {
        int mid;
        if (first > last) {
            return -1;
        }
        mid = (first + last) / 2;
        if (numbers[mid] == target) {
            return mid;
        } else if (numbers[mid] > target) {
            return recursiveBinarySearch(numbers, first, mid - 1, target);
        } else {
            return recursiveBinarySearch(numbers, mid + 1, last, target);
        }
    }
}
