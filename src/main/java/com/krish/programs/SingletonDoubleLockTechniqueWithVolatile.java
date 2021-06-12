package com.krish.programs;

/**
 * Creating Singleton object using double locking technique
 * @author Krishna Sure
 *
 */
public class SingletonDoubleLockTechniqueWithVolatile implements Cloneable, Serializable {

	private volatile static SingletonDoubleLockTechniqueWithVolatile instance;
	
	private SingletonDoubleLockTechniqueWithVolatile() {
		//preventing object creation from outside
	}
	
	/**
	 * Implementation of double checked locking of singleton, to minimize of 
	 * Synchronization and improve performance, by only locking critical section of 
	 * code which creates instance of singleton class, still this is broken if we 
	 * don't use volatile variable, as another thread can see half initialized instance 
	 * of singleton  
	 * 
	 * @return
	 */
	public static SingletonDoubleLockTechniqueWithVolatile getInstance() {
		
		if(null == instance) {
			synchronized(SingletonDoubleLockTechniqueWithVolatile.class) {
				if(null == instance)
					instance = new SingletonDoubleLockTechniqueWithVolatile();
			}
		}
		
		return instance;
	}
	
	/**
	 * returning current object when try to clone the singleton object
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;//returning cureent object
	}
	
	/**
	* returning current object when try to serialize and deserialize the singleton oject
	*/
	private Object readResolve() throws ObjectStreamException {
		return this;//returning current object
	}
	
}
