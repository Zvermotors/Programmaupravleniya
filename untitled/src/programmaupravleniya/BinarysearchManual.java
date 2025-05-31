package programmaupravleniya;

public class BinarysearchManual {
    public  String binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return "Число " + target + " найдено на позиции " + mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Число " + target + " не найдено";
    }
}
