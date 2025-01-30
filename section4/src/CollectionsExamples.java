import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsExamples {

    public static void main(String[] args) {

        // Array List.
        ArrayList<String> lst = new ArrayList<>();
        lst.add("firstStr");
        lst.add("secondStr");

        // this is very inefficient due to re-dimensioning and specific positioning.
        lst.add(0, "Pauvel");
        System.out.println(lst.size());
        System.out.println(lst);

        // Linked Lists.

        LinkedList<String> linkedLst = new LinkedList<>();
        linkedLst.add("First item");
        linkedLst.add("Second item");
        linkedLst.add("Third item");

        System.out.println(linkedLst);
//        System.out.println(linkedLst.poll());
//        System.out.println(linkedLst.peek());
        System.out.println(linkedLst);
        System.out.println("1nd= " +linkedLst.getFirst());
        System.out.println(linkedLst.size() +"nd= "+linkedLst.getLast());







    }

}
