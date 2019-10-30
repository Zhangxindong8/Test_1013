import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(1,"Hello");
        map.put(3,"java");
        map.put(2,"hehe");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(99));
        for(Integer Key : map.keySet()){
            System.out.println(Key);
        }
        for(String value : map.values()){
            System.out.println(value);
        }
        for(Map.Entry<Integer,String>entry : map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
