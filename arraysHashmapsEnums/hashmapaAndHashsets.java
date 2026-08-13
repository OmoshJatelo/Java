
import java.util.HashSet;
import java.util.HashMap;
public class hashmapaAndHashsets {
    public static void main(String[]  args){
        HashSet<String> names = new HashSet<>(); //Hashset stores Unique values
        names.add("Omosh");
        names.add("jatelo");
        names.add("Omosh");// this second name isnt added beacuse it is a duplicate
        names.add("Okoth Smart");

        System.out.println(names);

        //Hashmaps ar key value pair
        HashMap<Integer, String> ranks = new HashMap<>();
        ranks.put(1,"Omosh");
        ranks.put(4,"Enginner Smart");






    }
}
