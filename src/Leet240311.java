import java.util.HashMap;

class Leet240311 {
    public String customSortString(String order, String s) {
        int[] sChars = new int[26];
        for(char c : s.toCharArray()){
            sChars[c-'a']+=1;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()){
            while(sChars[c-'a'] > 0){
                sb.append(c);
                sChars[c-'a']-=1;
            }
        }

        for(int i = 0; i < 26; i++){
            char c = (char)(i+'a');
            while(sChars[c-'a'] > 0){
                sb.append(c);
                sChars[c-'a']-=1;
            }
        }
        return sb.toString();
    }
}

//        // HashMap으로 순서 정리
//        HashMap<Character, Integer> map = new HashMap<>();
//        int number = 1;
//
//        for(char i : order.toCharArray()){
//            map.put(i, number++);
//        }
//
//        // s에서 순서가 있는 알파벳과 아닌 알파벳 분리
//        int[] orderArray = new int[26];
//        int[] nonOrderArray = new int[26];
//        int nonOrderCount = 0;
//
//        for(char i : s.toCharArray()){
//            int index = i - 97;
//            if(map.containsKey(i)){
//                orderArray[index]++;
//                continue;
//            }
//            nonOrderArray[index]++;
//            nonOrderCount++;
//        }
//
//        // 결과 배열에 순서 없는 알파벳 채우기
//        int resultIndex=0;
//        char[] result = new char[s.length()];
//        for(int i=0; i<26; i++){
//            while(nonOrderArray[i]>0){
//                result[resultIndex++] = (char) (i + 97);
//                nonOrderArray[i]--;
//            }
//        }
//
//        // 순서 없는 알파벳의 끝 인덱스 기록
//        int pivotIndex = resultIndex;
//
//        // 순서 있는 알파벳 채우기
//        for(int i=0; i<26; i++){
//            while(orderArray[i]>0){
//                result[resultIndex] = (char) (i + 97);
//                resultIndex++;
//                orderArray[i]--;
//            }
//        }
//
//        // 순서 있는 알파벳만을 대상으로 퀵 정렬 진행
//        quickSortCustom(result, pivotIndex, result.length-1, map);
//
//        String resultString = String.valueOf(result);
//        return resultString;
//    }
//
//    public static void quickSortCustom(char[] array, int low, int high, HashMap<Character, Integer> map) {
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
//    public static int partition(char[] array, int low, int high, HashMap<Character, Integer> map) {
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
