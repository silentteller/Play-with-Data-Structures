public class LinkedListMapTest {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new LinkedListMap<>();
        for(int i = 0; i < 5; ++i){
            map.add(i, i * i);
        }
        System.out.println(map);
        map.remove(4);
        System.out.println(map);
    }
}
