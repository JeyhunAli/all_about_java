package all_aboutJava_Java;
/**
 * 
 * @author jey
 * this method is checking whether in given String charachters are numeric or no
 *
 */

public class Is_Numeric {

	public static boolean isEmpty(CharSequence cs) {

		return cs == null || cs.length() == 0;
	}

	public static boolean is_Digitalic(CharSequence cs) {

		if(isEmpty(cs)) {
			return false;
		}

		int len = cs.length();

		for(int i=0; i<len; i++) {

			if( ! Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}

		return true;


	}



	public static void main(String[] args) {

		/**
		 * testing method functionality with different use cases
		 */

		System.out.println(is_Digitalic(null));
		System.out.println(is_Digitalic("0"));
		System.out.println(is_Digitalic("gelmishdun"));
		System.out.println(is_Digitalic(" "));
		System.out.println(is_Digitalic("15"));
		System.out.println(is_Digitalic("12345"));
		System.out.println(is_Digitalic("testing"));
		System.out.println(is_Digitalic("testing12345"));
		System.out.println(is_Digitalic("-12345"));
		System.out.println(is_Digitalic("+12345"));
		System.out.println(is_Digitalic("4.5"));
		System.out.println(is_Digitalic("a"));
		System.out.println(is_Digitalic("12345t"));
		System.out.println(is_Digitalic("t12345"));
		System.out.println(is_Digitalic(""));
		System.out.println(is_Digitalic("10000000000000"));















	}

}
