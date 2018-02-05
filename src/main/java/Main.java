import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandra on 2/5/18.
 */
public class Main {

    public static void one (String[] args ) {
        int x=10 ;

        String name = "Vova";
        double salary = 1.56;

        String b = x+"";
        String c = x+""+10;
        String d= x+""+(10+100);
        String v =x+""+ 10*x;

        System.out.println(v);

        System.out.println("Length"+ v.length() );
        System.out.println("Index of 0"+ v.indexOf("0") );
        System.out.println("Last index of 0"+ v.lastIndexOf("0") );


        System.out.println(name + " get salary in amount " +salary + " in " + x+  " months ");
    }

    public static void main (String[] args)
    {
        // Type safe array list, stores only string
        List<String> l = new ArrayList<String>(5);

        l.add("GeeksforGeeks");
        l.add("Practice");
        l.add("GeeksQuiz");
        l.add("IDE");
        l.add("Courses");

        List<String> range = new ArrayList<String>();

        // return List between 2nd(including)
        // and 4th element(excluding)
        range.addAll(l.subList(2, 4));
        System.out.println(range);  // [GeeksQuiz, IDE]

        boolean isContaine = l.containsAll(range);

        System.out.println(isContaine);

        l.add("Tutorial");
        l.remove(0);
        System.out.println("List "+ l);

        l.remove("IDE");
        System.out.println("List "+ l);

        l.add(3, "New item");
        System.out.println("List "+ l);


        l.set(2 , "Setted item" );
        System.out.println("List "+ l);


        System.out.println(" Size is " + l.size() );


    }
}
