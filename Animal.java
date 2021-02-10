package ques4;

public class Animal {
  String name;
  
	public Animal(String name) {
	super();
	this.name = name;
}
	

	@Override
	public String toString() {
		return "Animal : " + name ;
	}


	public void shout(){
		System.out.println("Animal Shouts");
		
	}
}
