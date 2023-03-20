import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class WordCounts {
    
    public static HashSet<String> loadWords(String filename) {
        HashSet<String> words = new HashSet<String>();
        try{
            Scanner in = new Scanner(new File(filename));
            while(in.hasNext()){
                String word = in.next();
                words.add(word.replaceAll("[^a-zA-Z]", "").toLowerCase());
                //toLowerCase());
                //System.out.println(line);
            }
        } catch(Exception e){
            System.out.println("error :(" + e.getMessage());
        }


        return words;
    }   

    public static HashMap<String, Integer> countWords(String filename) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        try{
            Scanner in = new Scanner(new File(filename));
            while(in.hasNext()){
                String word = in.next();
                word = (word.replaceAll("[^a-zA-Z]", "").toLowerCase());

                if(words.containsKey(word)){
                    words.put(word, (words.get(word) + 1));
                } else{
                    words.put(word, 1);
                }

                //toLowerCase());
                //System.out.println(line);
            }
        } catch(Exception e){
            System.out.println("error :(" + e.getMessage());
        }

        
        return words;
    }   
    



    public static void main(String[] args) {
        /*HashSet<String> tempestWords = loadWords("tempest.txt");
        System.out.println(tempestWords.size());

        HashSet<String> midsummerWords = loadWords("midsummer.txt");
        System.out.println(midsummerWords.size());

        HashSet<String> intersection = new HashSet<String>(tempestWords); // this makes intersection a copy (copy constructor :))

        HashSet<String> tempestOnly = new HashSet<String>(tempestWords);

        intersection.retainAll(midsummerWords);
        System.out.println(intersection.size());

        tempestOnly.removeAll(midsummerWords);
        System.out.println(tempestOnly.size());*/

        HashMap<String, Integer> tempestCounts = countWords("tempest.txt");
        System.out.println(tempestCounts);

        Iterator<String> iter = tempestCounts.keySet().iterator();
        while(iter.hasNext()){
            String key = iter.next();
            if(tempestCounts.get(key)> 100){
                System.out.println(key + " : " + tempestCounts.get(key));
            }
            //System.out.println(tempestCounts.get(key));
        }
    }

}


//Map - collection of items
//maps "incredibly powerful" - Dr. Hibbs oo lala
//The index of a map doesn't have to be ints 0 1 2...
//The index for a map can be strings or whatever or bool whatever u want baby chicken
//Hash Map!!!!!