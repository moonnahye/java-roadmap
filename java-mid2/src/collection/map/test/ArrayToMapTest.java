package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java","10000"},{"Spring","20000"},{"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String,Integer> productMap = new HashMap<>();
        for(String[] product: productArr) {
            productMap.put(product[0], Integer.parseInt(product[1]));
        }

        // Map의 모든 데이터 출력
        Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
