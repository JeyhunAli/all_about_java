package java_Naveen_;

/**
 * @author jey
 * 
 * practical example of the method overloading
 * 
 * OTP stands for 'One Time Password'.
OTP testing is an innovation testing technique or testing approach. 
These days OTP is widely used for the security purpose in all 
applications so that genuine user can only have the access.
 *
 */

public class LoginPage_M_overloading {

	public void login() {

	}

	public void login(long phoneNumber) {
		
	}

	public void login(long phoneNumber, int otp) {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String socialMediaAccount) {

	}

	public static void main(String[] args) {

		LoginPage_M_overloading lp = new LoginPage_M_overloading();
		lp.login(99999);

		lp.login("naveen");

		lp.login("naveen@gmail.com", "test123");

	}

}
