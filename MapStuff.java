import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MapStuff {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(17, "seventeen");
        System.out.println(map);
        System.out.println(map.get(3)); //returns "three"
        System.out.println(map.get(7)); //returns "null"
        System.out.println(map.size());
        //maps have no order l o l
        map.put(3, "Ardvark"); //a key can't point to multiple thing, so it just replaces/updates the value that key unlocks
        System.out.println(map);

        //iterating through maps
        Set<Integer> keys = map.keySet(); //takes all keys and makes them into a hashset
        //weird inheritance magic lol
        Iterator<Integer> iter = keys.iterator();
        while(iter.hasNext()){
            int key = iter.next();
            System.out.println(map.get(key));
        }

        map.remove(3);
        System.out.println(map);
        System.out.println(map.containsKey(6));//returns bool
        System.out.println(map.containsValue("one"));

        //we do this later lol List<String> vals = map.values();

        map.clear();
        System.out.println(map);

        //most frequent word in the tempest?

    }
}
