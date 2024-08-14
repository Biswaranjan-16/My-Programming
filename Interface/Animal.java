package Interface;

interface Pasu {
void show();
}

class Dog implements Pasu{

	
	public void show() {
		System.out.println("Dog Barking");
		
	}
	
}

class Cat implements Pasu{

	
	public void show() {
		System.out.println("Cat Barking");
		
	}
	
}

class Animal{  
public static void main(String args[]){
	Pasu a=new Cat();
	a.show();
	Pasu b=new Dog();
	b.show();

}
    }
