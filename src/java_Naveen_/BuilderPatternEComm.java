package java_Naveen_;

public class  BuilderPatternEComm {
	
	//Builder Pattern using this keyword
	//this another way of using this keyword in java 
	//so far i know in constructor we use this keyword to make equal global var to the local var inside the function 
	//but here we are returning current class object using this keyword very handy

	public BuilderPatternEComm login(String un, String pwd) {
		System.out.println("login with :" + un + " :" +pwd);
		return this;
	}

	public BuilderPatternEComm search(String productName) {
		System.out.println("search with : " + productName);
		return this;
	}

	public BuilderPatternEComm search(String productName, int price) {
		System.out.println("search with : " + productName + " price: " + price);
		return this;
	}

	public BuilderPatternEComm addToCart(String productName) {
		System.out.println("Adding to cart: " + productName);
		return this;
	}

	public BuilderPatternEComm checkout(String productName) {
		System.out.println("checkout this product: " + productName);
		return this;
	}

	public BuilderPatternEComm doPayment(String CC, String pwd) {
		System.out.println("payment is done using : " + CC + " pwd " + pwd);
		return this;
	}

	public BuilderPatternEComm generateOrder(String productName) {
		System.out.println("Your order id is : " + 12345 + " for this product " + productName);
		return this;
	}

}
