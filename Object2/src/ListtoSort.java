import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 class Student implements Comparable<Student> {
   private int studentId;
   private String name;
   public Student(int studentId,String name){
	 this.studentId=studentId;
	 this.name=name;
	 }
   
	public int getStudentId() {
	return studentId;
}

   public void setStudentId(int studentId) {
	this.studentId = studentId;
}

   public String getName() {
	return name;
}

  public void setName(String name) {
	this.name = name;
}
  @Override
	public int compareTo(Student b2) {
		int erg =name.compareTo(b2.name);
		return erg;
	}
  @Override
  public String toString() {
 return "[StudentId=" + studentId + ", Name=" + name + "]";
  }
 }
public class ListtoSort	{
	private static void print(List<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studOne = new Student(54,"Albert Einstein");
		Student studTwo = new Student(1234,"Gottfried Wilhelm Leibniz");
		Student studTree = new Student(5421,"Carl Friedrich Gauss");
		Student students[] = { studOne, studTwo, studTree };
		List<Student> studList=Arrays.asList(students);
		print(studList);// Before Sorting
		System.out.println("----Sorted");
        Collections.sort(studList);
        print(studList);// After Sorting

	}

}


