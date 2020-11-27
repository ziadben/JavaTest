import java.util.*;
public class Main {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		System.out.println(ns);
		 NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
		 System.out.println("3 or  more:  " + threeOrMore);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 Queue<String> queue = new LinkedList<>();
		    queue.add("Java");
		    // offer() will work the same as add()
		    queue.offer("SQL");
		    queue.offer("CSS");
		    queue.offer("XML");

		    System.out.println("Queue: " + queue);

		    // Let's remove elements until the queue is empty
		    while (queue.peek() != null) {
		      System.out.println("Head  Element: " + queue.peek());
		      queue.remove();
		      System.out.println("Removed one  element from  Queue");
		      System.out.println("Queue: " + queue);
		    }
		    System.out.println("queue.isEmpty(): " + queue.isEmpty());
		    System.out.println("queue.peek(): " + queue.peek());
		    System.out.println("queue.poll(): " + queue.poll());
		    try {
		      String str = queue.element();
		      System.out.println("queue.element(): " + str);
		      str = queue.remove();
		      System.out.println("queue.remove(): " + str);
		    } catch (NoSuchElementException e) {
		      System.out.println("queue.remove(): Queue is  empty.");
		    }

	}

}
