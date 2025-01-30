import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

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


        // priority queue.

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.offer(1000);
        pQueue.offer(500);
        pQueue.offer(100);
        pQueue.offer(800);

        System.out.println(pQueue);

        // HashSet

        HashSet<String> names = new HashSet<>();

        names.add("Polska");
        names.add("Polska");
        names.add("Juan");
        names.add("Pepe");

        System.out.println(names);



    }

}
