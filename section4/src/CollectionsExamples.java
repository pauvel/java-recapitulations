import java.util.*;

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


        // TreeSet

        TreeSet<Character> letters = new TreeSet<>();

        letters.add('b');
        letters.add('c');
        letters.add('a');

        System.out.println(letters);

        // The output is sorted by the length of the strings.
        TreeSet<String> things = new TreeSet<>(Comparator.comparingInt(String::length));

        things.add("chair");
        things.add("Cup");
        things.add("Car");
        things.add("Wheel");
        things.add("O");

        System.out.println(things);






    }

}
