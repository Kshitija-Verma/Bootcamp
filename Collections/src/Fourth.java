import java.util.*;

public class Fourth {

    static void printMap(HashMap <String,Integer >m) {
        for (Map.Entry<String,Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    public static void Sorting (HashMap<String,Integer> map){

       List<Map.Entry<String,Integer >> list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String,Integer> t1, Map.Entry<String,Integer> t2) {
                return t1.getValue().compareTo(t2.getValue());
            }
        });
        System.out.println("After Sorting......");
        HashMap<String,Integer> sortedMap = new LinkedHashMap();
        for (Map.Entry<String,Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedMap);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("Kshitija", 5);
        hash.put("Disha", 9);
        hash.put("Sonia", 1);
        hash.put("Anamika", 7);
        hash.put("Gargi", 3);
        System.out.println("Before sorting .....");
        printMap(hash);
        Sorting(hash);


    }

}
