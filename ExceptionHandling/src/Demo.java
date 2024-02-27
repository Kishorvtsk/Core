
public class Demo {
	// exception occur
	void m(){  
	    int data=50/0;  
	  }  
	// n call m
	  void n(){  
	    m();  
	  }  
	  // p call n
	  void p(){  
	   try{  
	    n();  
	   }catch (Exception e) {
		System.out.println("Exception handle");
	}
	  }
	public static void main(String[] args) {
		Demo d = new Demo();
		d.p();
		System.out.println("Normal flow");
	}
		
		
	}