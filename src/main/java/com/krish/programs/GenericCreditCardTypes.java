package com.krish.programs;

/**
 * My own Generic Class Created
 * @author Krishna Sure
 *
 */
public class GenericCreditCardTypes {

	public static void main(String[] args) {
		
		CreditCard<Silver> cSilver = new CreditCard(new Silver());
		cSilver.show();
		System.out.println(cSilver.getObject()+"\n");
		
		CreditCard<Gold> cGold = new CreditCard(new Gold());
		cGold.show();
		System.out.println(cGold.getObject()+"\n");
		
		CreditCard<Platinum> cPlatinum = new CreditCard(new Platinum());
		cPlatinum.show();
		System.out.println(cPlatinum.getObject()+"\n");
		
	}
}


class CreditCard<T>{
	
	private T object;
	
	public CreditCard(T object) {
		this.object = object;
	}
	
	public void show() {
		System.out.println("The type of object is :: "+object.getClass().getName());
	}
	
	public T getObject() {
		return object;
	}
}

class Silver {
	Silver(){
		System.out.println("Silver Card");
	}
}

class Gold {
	Gold(){
		System.out.println("Gold Card");
	}
}

class Platinum {
	Platinum(){
		System.out.println("Platinum Card");
	}
}


class BoundedType<T extends Number>{
	
}

class BoundedTypes<T extends Number & Runnable>{
	
}

//Valid
class One<X>{}
class Two<X,Y>{}
class Three<A,B,C>{}
class Four<A,B,C,D>{}

//Invalid should be first class next interface
/*class NotBoundedType<T extends Runnable & Number>{
	
}*/

//Invalid should be only one class
/*class NotBoundedTypeOne<T extends Number & Thread>{
	
}*/
