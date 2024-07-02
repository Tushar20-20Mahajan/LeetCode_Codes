// import java.util.*;

// class Solution {
//     public int findLeastNumOfUniqueInts(int[] arr, int k) {
//         ArrayList<Integer> list1 = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             list1.add(arr[i]);
//         }

//         LinkedHashSet<Integer> list2 = new LinkedHashSet<>(list1);
//         ArrayList<Integer> listNew = new ArrayList<>(list2);

//         ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>();
//         for (int i = 0; i < listNew.size(); i++) {
//             list.add(new AbstractMap.SimpleEntry<>(listNew.get(i), Collections.frequency(list1, listNew.get(i))));
//         }

//         list.sort(Map.Entry.comparingByValue());

//         int i = 0;
//         while (k > 0 && i < list.size()) {
//             int frequency = list.get(i).getValue();
//             if (k >= frequency) {
//                 k -= frequency;
//                 i++;
//             } else {
//                 break;
//             }
//         }

//         return list.size() - i;
//     }
// }


import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Count frequencies using a Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of entries from the Map
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());

        // Sort the list by frequency
        list.sort(Map.Entry.comparingByValue());

        int i = 0;
        while (k > 0 && i < list.size()) {
            int frequency = list.get(i).getValue();
            if (k >= frequency) {
                k -= frequency;
                i++;
            } else {
                break;
            }
        }

        return list.size() - i;
    }
}