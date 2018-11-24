package mypackage;

import java.util.Random;

public class Animal {
	char c = (char)7000;
    String name;
	Animal(String name){
		this.name = name;
	}
    Animal(){
    	this(makeRandomName());
    	}
    
    static String makeRandomName() {
		 int x = (int)(Math.random()*4);
	String name = new String[] {"hai","hoa","wifi","haya"}[x];
		return name;
	}
	public static void main(String[] args) {
        Animal a= new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Zeus");
		System.out.println(b.name+"  "+b.c);

	
	
        

		
	}

}
