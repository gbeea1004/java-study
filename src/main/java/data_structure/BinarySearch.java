package data_structure;

class BinarySearch {

    int start(int[] arr, int searchNo) {
        int first = 0;
        int last = arr.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (arr[mid] == searchNo) {
                return mid;
            } else if (arr[mid] > searchNo) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }
}
