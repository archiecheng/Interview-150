package ArrayAndString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private HashMap<Integer, Integer> valToIndex;
    // HashMap<key, value> key 代表集合中元素的值,
    // value 代表这个值在 ArrayList 中的索引,
    // 表示它在 ArrayList 中的位置

    private ArrayList<Integer> list;
    private Random rand;

    public RandomizedSet() {
        valToIndex = new HashMap<>(); // 初始化哈希表
        list = new ArrayList<>();   // 初始化集合
        rand = new Random(); // 初始化随机数
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val))
            return false;
        valToIndex.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!valToIndex.containsKey(val))
            return false;
        int idx = valToIndex.get(val); // 根据值获得 idx, 也就是这个值在集合里的下标
        int lastVal = list.get(list.size() - 1); // 获得集合的最后一个元素的值
        if(idx < list.size() - 1){ // 如果这个值在集合里的下标小于 集合最后一个元素的下标
            list.set(idx, lastVal);
            valToIndex.put(lastVal, idx);
        }
        valToIndex.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

public class _380InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

//        System.out.println("insert(1): " + randomizedSet.insert(1));
//        System.out.println("insert(1): " + randomizedSet.insert(1));
//        System.out.println("insert(1): " + randomizedSet.insert(1));
//        System.out.println("insert(1): " + randomizedSet.insert(1));
//        System.out.println("getRandom(): " + randomizedSet.getRandom());

        System.out.println("insert(10): " + randomizedSet.insert(10));
        System.out.println("insert(20): " + randomizedSet.insert(20));
        System.out.println("insert(30): " + randomizedSet.insert(30));
        System.out.println("getRandom(): " + randomizedSet.getRandom());
        System.out.println("revove(20): " + randomizedSet.remove(20));
        System.out.println("getRandom(): " + randomizedSet.getRandom());
    }
}
