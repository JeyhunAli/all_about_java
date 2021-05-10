package Interface;

public interface IndianMedical {

	/**
	 * no method body in interface only method declaration protatype //cannot
	 * create object of interface , interface cannot be instantiate //in interface
	 * we can define the variables and the given variables in interface are not
	 * allowed to change //when we accesing the interface variables the given value
	 * of variables are not allowed to change //in interface no static method
	 * allowed. why because we cannot implement it while creation of object of interface 
	 * 
	 * 
	 * diamond problem actually solved by interface in interface we can extends two interface as parent 
	 * multiple inheritance possible in interface
	 * 
	 * Interface In interface we never write main method Interface is hundred
	 * percent abstraction In interface we cannot have any method body in interface
	 * class to class we use extends keyword But class to interface we use implement
	 * keyword Method override in interface and as well as in inheritance We can
	 * use @override annotations as well In interface we can implement multiple
	 * interface In interface we can define variables too No static method are
	 * allowed in interface Why because We have to implement all the interface
	 * regulations But interface variables static and final in nature If we declare
	 * as static then we have to write final as well Because interface variables
	 * final and static in nature We cannot create object of the interface We can
	 * achieve top casting in interface Child class object can be referred by parent
	 * interface reference variables
	 * 
	 * But in tap casting we cannot access child class methods In tap casting we can
	 * only access that specific parent interface methods Not other interface
	 * methods In interface we can access all the variables by class name In inter
	 * we cannot change the value of the variables They are declared by default
	 * static and final In interface down casting its not allowed because we cannot
	 * instantiate Of parent class After Jdk 1.8 new 2 features added 1 we can have
	 * method-body with default method name
	 * 
	 * Default void 911Servucices(){ } And also we can override the method And its
	 * not affect intention of interface And we can access to this method in child
	 * class And as well as in top casting method
	 * 
	 * 2 we can have static method in interface with body But we cannot override it
	 * 
	 * 
	 * But without body any static method not allowed in interface
	 * but static method not overriden 
	 * 
	 * We can access interface static method just by interface name because its
	 * static in nature If in interface we are implementing another interface
	 * methods we use extends keyword but we have to implement extended interface
	 * methods as well We cannot have private method in interface Because we cannot
	 * override it to child class
	 * 
	 * we can have method with body with default modifier and we can override it
	 * 
	 * type reference signature checking happening lets say you implement us medical
	 * indian medical and uk medical and in your test class you are creating top
	 * casting based on the us medical serice then u can access only us medical
	 * class and your class which is overriden despite u iplementing uk and indian
	 * medical you cannot access them and u cannot access independent methods as
	 * well all this because of the refernce type checking concept
	 * 
	 */

	public void oncologyServices();

	public void radioServices();

	public void pathologyServices();

	public void orthoServices();

}
