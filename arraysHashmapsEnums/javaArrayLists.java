import java.util.ArrayList;

public class javaArrayLists {
    public void main (String[] args){
        System.out.println("This is the  exposition of java arraylists");
        ArrayList<String> names = new ArrayList<>(); //dynamically increases in size

        names.add("jatelo");
        names.add("Omosh");
        names.add("Wechebberrinuous");
        names.add("Okoth Smart");
        names.add("Calvince");

        for(int i=0;i<names.size();i++){
            System.out.println(i +1 +"." + names.get(i));
        }

        System.out.println("Omosh Occupies Index "+names.indexOf("Omosh")+" In The list");

        System.out.println("The size of the list is "+ names.size());
        names.set(1,"Engineer Omosh");
        System.out.println(names);

        names.remove(3);
        System.out.println(names);

        names.clear();
        System.out.println("The size of The List is now "+ names.size());





    }
}
