import java.util.HashMap;

public class Leet240308 {

    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] array = new int[nums.length];
        int max = 0;

        for(int i : nums){
            if(map.get(i)==null){
                map.put(i,1);
                array[0]++;
                max = Math.max(max,1);
                continue;
            };

            Integer count = map.get(i);
            map.put(i, count+1);
            max = Math.max(max, count+1);
            array[count]++;
        }

        return max * array[max-1];
    }
}
