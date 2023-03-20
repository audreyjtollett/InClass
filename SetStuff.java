import java.util.HashSet;
import java.util.Iterator;

public class SetStuff {
    
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<Integer>();
        System.out.println(set1);
        set1.add(5);
        set1.add(12);
        System.out.println(set1);
        set1.add(5); //it wont add 5 again bc no duplicates yAS
        for(int i=0; i<10; i++){
            set1.add(i);
        }
        System.out.println(set1);
        //order that set is printed is sorted, set order does not matter, no indexing... no get method for a set
        set1.remove(3);
        System.out.println(set1.size());
        //what do I do to total all the numbers in this set?

        //ITERATORS- we will talk about next time :D
        //Iterator<E> runs an iterator over the elements in the set

        //addAll, retainAll, removeAll........ CHANGE the set, so often helpful to make a copy

        int total =0;
        //Iterator can get you the next thing and say if there is a next hing
        //.hasNext() and .next()
        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext()){
            total += iter.next();
        }
        //one pitfall : every time you call next, you get the NEXT THING
        // Different nexts won't refer to the same thing, have to set as a variable or something silly goose 
        System.out.println(total);
    }
}
