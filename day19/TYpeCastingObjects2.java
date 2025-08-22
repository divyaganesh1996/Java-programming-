package day19;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}



public class TYpeCastingObjects2 {

	public static void main(String[] args) {
		
		//rule 1 - conversion
		Animal a = new Dog();
		Cat ct = (Cat) a; //valid
		
//		Dog d= new Dog();
//		Cat c = (Cat) d;//not valid
//		 rule 2 - assignment is valid or not
		
//		Animal a = new Dog();
//		Cat ct = (Cat) a; //valid as per rule2
		
//		Animal a = new Dog();
//		Cat c = (Dog) a;//not valid as per rule2

	}

}
