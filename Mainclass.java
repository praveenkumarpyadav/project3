package polymorphism;
class Animal{
	void noise() {
		System.out.println("make sound");
	}
}
class Dog extends Animal{
	void noise() {
		System.out.println("boww");
	}
}
class Cat extends Animal{
	void noise() {
		System.out.println("meoww");
	}
}
class Snake extends Animal{
	void noise() {
		System.out.println("buss");
	}
}
class Stimulator{
	static void ansim(Animal a) {
		a.noise();
	}
}
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d1=new Dog();
        Snake s1=new Snake();
        Cat c1=new Cat();
        Stimulator.ansim(d1);
        Stimulator.ansim(c1);
        Stimulator.ansim(s1);
	}

}
