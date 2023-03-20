import java.util.ArrayList;

public class ArrayListTester {
    public static void main (String[] args){
        System.out.println("HelloWorld!");
        ArrayList<String> lst = new ArrayList<String>();
        System.out.println(lst);

        lst.add("Hello");
        lst.add("Goodbye");

        System.out.println(lst);

        //if you do .add an argument, it gets pinned to the end of the list

        lst.add(1, "Something");

        System.out.println(lst);

        //if you add something while indicating its index, everything gets shifted to make a hole for new thing

        System.out.println(lst.get(2));
        //.get(i) to get specific index in list

        lst.set(2, "Else");
        //equiv lst[2] = "Else" type beat
        System.out.println(lst);

        lst.remove(1);
        System.out.println(lst);
        //can create hole and shift everything back

        //much more flexible!

        lst.remove(lst.size()-1);
        //.size() instead of .length()
        //gotta do -1 otherwise out of bounds exception

        System.out.println(lst.contains("Else"));
        //.contains will return boolean

        
    }
}
