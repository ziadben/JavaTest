package prioryqueue;

import java.util.*;

class ComparablePerson implements Comparable<ComparablePerson> {
	  private int id;
	  private String name;

	  public ComparablePerson(int id, String name) {
	    this.id = id;
	    this.name = name;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  @Override
	  public boolean equals(Object o) {
	   if(!(o instanceof ComparablePerson))
		   return false;
	   ComparablePerson p = (ComparablePerson)o;
	    if (this.id == p.getId()) {
	      return true;
	    }

	    return false;
	  }

	  @Override
	  public int hashCode() {
	    return this.id;
	  }

	  @Override
	  public String toString() {
	    return "(" + id + ", " + name + ")";
	  }

	  @Override
	  public int compareTo(ComparablePerson cp) {

	    int cpId = cp.getId();
	    String cpName = cp.getName();

	    if (this.getId() < cpId) {
	      return -1;
	    }

	    if (this.getId() > cpId) {
	      return 1;
	    }

	    if (this.getId() == cpId) {
	      return this.getName().compareTo(cpName);
	    }
	     
	    // Should not reach here 
	    return 0;
	  }
	}

public class Main {

	public static void main(String[] args) {
		 Queue<ComparablePerson> pq = new PriorityQueue<>();
		    pq.add(new ComparablePerson(1, "Oracle"));
		    pq.add(new ComparablePerson(4, "XML"));
		    pq.add(new ComparablePerson(2, "HTML"));
		    pq.add(new ComparablePerson(3, "CSS"));
		    pq.add(new ComparablePerson(4, "Java"));
            System.out.println(pq);
		    while (pq.peek() != null) {
		      System.out.println("Head  Element: " + pq.peek());
		      pq.remove();
		      System.out.println("Priority  queue: " + pq);
		    }

	}

}
