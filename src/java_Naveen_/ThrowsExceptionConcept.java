package java_Naveen_;

public class ThrowsExceptionConcept {
	
	static int i;

	public static void main(String[] args) throws Exception {


		ThrowsExceptionConcept throwww = new ThrowsExceptionConcept();
	throwww.methodNumber_1();

	}


	public void methodNumber_1() throws Exception {
		methodNumber_2();
        System.out.println("methodNumber_1");
	}

	public void methodNumber_2() throws Exception {
		methodNumber_3();
		System.out.println("methodNumber_2");
	}

    public void methodNumber_3() throws Exception {
    	methodNumber_4();
    	System.out.println("methodNumber_3");
    }

    public void methodNumber_4() throws Exception {
    	System.out.println("methodNumber_4");
    	methodNumber_5();
    }
    
    public int methodNumber_5() throws Exception{
    	
    	i=8/0;
    	System.out.println("methodNumber_5");
    	System.out.println(i);
    	return i;
    

    }
	}