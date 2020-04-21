import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SetMapInterview {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            Integer value = map.get(x);
            if (value == null) {
                // 当前这个数字在 map 中不存在. 就新增一个键值对
                map.put(x, 1);
            } else {
                // 当前这个数字前面已经存在过了~, 把 value 再加 1 即可
                map.put(x, value + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        Iterator<HashMap.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue().equals(1)) {
               return entry.getKey();
            }
        }
        return 0;
    }

    public int singleNumber(int[] array) {
        int ret = 0;
        for (int x : array) {
            ret ^= x;
        }
        return ret;
    }

    public int[] singleNumber2(int[] nums) {
        // 1. 先把所有数字异或到一起
        int ret = 0;
        for (int x : nums) {
            ret ^= x;
        }
        // 2. 此时的异或结果相当于 a ^ b, 值一定不为 0. 就可以从中找到某个为 1 的 bit 位
        int bit = 1;
        int i = 0;
        for (; i < 32; i++) {
            if ((ret & (bit << i)) != 0) {
                break;
            }
        }
        // 循环结束之后, bit 中的值, 就是刚找到某一位为 1 的值
        // 进行分组
        int a = 0;
        int b = 0;
        for (int x : nums) {
            if ((x & (bit << i)) != 0) {
                // 第一组, 指定位为 1
                a ^= x;
            } else {
                // 第二组, 指定位为 0
                b ^= x;
            }
        }
        int[] array = {a, b};
        return array;
    }

    public static void main(String[] args) {
        SetMapInterview interview = new SetMapInterview();
        int[] array = {1, 1, 2, 2, 4, 5};
        int[] result = interview.singleNumber2(array);
        System.out.println(Arrays.toString(result));
    }

}
