import java.util.*;

/**
 * Created by Тим on 07.06.2017.
 */
public class Cities {
    public static void main(String[] args) {
        Map<Integer,String> hashCities = new HashMap<>();
        fillMap(hashCities);
        Map<Integer,String> treeMap = new TreeMap<>(hashCities);
        fillMap(treeMap);
        System.out.println(treeMap);
        System.out.println();

        List<Integer> list = new ArrayList<>(hashCities.keySet());
        Collections.sort(list);
        for (int n: list
                ) {
            System.out.println(hashCities.get(n));
        }
    }

    public static void fillMap(Map<Integer,String> map){
        map.put(150,"Самара");
        map.put(100,"Тольятти");
        map.put(75, "Алексеевка");
    }
}