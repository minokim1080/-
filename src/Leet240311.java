import java.util.Arrays;
import java.util.HashMap;

public class Leet240311 {
    public String customSortString(String order, String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int number = 1;
        for(char i : order.toCharArray()){
            map.put(i,number++);
        }

        char[] array = s.toCharArray();
        char[] alphabet = new char[26];
        char[] result = new char[s.length()];

        for(char i : array){
            int index = (int) i - 97;
            alphabet[index]++;
        }

        for(


//        quickSortCustom(array, 0, array.length-1, map);
//
//        String result = Arrays.toString(array);
//        return result;
    }

//    private void quickSortCustom(char[] array, int low, int high, HashMap<Character, Integer> map) {
//        if (low < high) {
//            // 피벗을 기준으로 배열을 분할하고 피벗의 위치를 찾음
//            int pivotIndex = partition(array, low, high, map);
//
//            // 피벗을 기준으로 좌우 부분 배열에 대해 재귀적으로 퀵 정렬 수행
//            quickSortCustom(array, low, pivotIndex - 1, map);
//            quickSortCustom(array, pivotIndex + 1, high, map);
//        }
//    }
//
//    private int partition(char[] array, int low, int high, HashMap<Character, Integer> map) {
//        // 피벗을 배열의 가운데 원소로 선택
//        int pivot = map.get(array[(low + high) / 2]);
//
//        // 피벗을 기준으로 작은 값은 왼쪽, 큰 값은 오른쪽으로 분할
//        while (low <= high) {
//            while (map.get(array[low]) < pivot) {
//                low++;
//            }
//            while (map.get(array[high]) > pivot) {
//                high--;
//            }
//
//            if (low <= high) {
//                // low와 high 위치의 원소 교환
//                char temp = array[low];
//                array[low] = array[high];
//                array[high] = temp;
//
//                // 다음 비교를 위해 low와 high 이동
//                low++;
//                high--;
//            }
//        }
//
//        return low;
//    }

}
