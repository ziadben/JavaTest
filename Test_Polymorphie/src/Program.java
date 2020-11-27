class Animal {
	public void eat() {
		System.out.println("a Animal eat");
	}
}
class Horse extends Animal{
	public void eat() {
		System.out.println("a Horse eat");
	}
	public void buck() {
		System.out.println("I buck");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("a Dog eat");
	}	
}
public class Program {

	public static void main(String[] args) {
//	    Animal ani = new Animal();
		Animal ani = new Dog();
		ani.eat();
		if (ani instanceof Dog) {
		Dog d = (Dog)ani;
		d.eat();
		System.out.println("########");
		}
		
		Animal[] a = { new Animal(),new Horse(),new Animal(),new Dog()};
       for (Animal animal:a) {
		animal.eat();
	   if (animal instanceof Horse) {
		  Horse h = (Horse)animal; 
		  h.buck();
	   }}
	

	}

}
