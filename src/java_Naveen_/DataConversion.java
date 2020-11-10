package java_Naveen_;

public class DataConversion {

	public static void main(String[] args) {

		// String to int:
		String x = "100";

		System.out.println(x + 20);// 10020

		String price = "2000";
		System.out.println(price + 20);// 200020 String congatination

		int p = Integer.parseInt(price);
		System.out.println(2000 + p);

		int i = Integer.parseInt(x);// 100
		System.out.println(i + 20);// 120

		String amount = "1000";
		int amount1 = Integer.parseInt(amount);
		System.out.println(amount1+1500 + " after wrapping amount" );

		// String to double:
		String y = "34.55";
		System.out.println(y + 20);
		double d = Double.parseDouble(y); // 34.55
		System.out.println(d + 20);

		String h = "100A";
		String hnew = h.replace("A", "");
		int hh = Integer.parseInt(hnew);
		System.out.println(hh + 20);

//		int p = Integer.parseInt(h);//NumberFormatException
//		System.out.println(p+20);

		// int to String:
		int k = 100;
		System.out.println(k + 20);
		String k1 = String.valueOf(k); // "100"
		System.out.println(k1 + 20);

	}

}