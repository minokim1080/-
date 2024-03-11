public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 배열을 분할하고 피벗의 위치를 찾음
            int pivotIndex = partition(array, low, high);

            // 피벗을 기준으로 좌우 부분 배열에 대해 재귀적으로 퀵 정렬 수행
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // 피벗을 배열의 가운데 원소로 선택 (다른 선택 방법도 가능)
        int pivot = array[(low + high) / 2];

        // 피벗을 기준으로 작은 값은 왼쪽, 큰 값은 오른쪽으로 분할
        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }

            if (low <= high) {
                // low와 high 위치의 원소 교환
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                // 다음 비교를 위해 low와 high 이동
                low++;
                high--;
            }
        }

        return low;
    }
}
