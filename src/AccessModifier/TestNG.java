package AccessModifier;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test(dependsOnMethods = {"athod2"})
	public void aahod1(){
	    // this one passes
		System.out.println("Method1");
	}

	@Test
	public void athod2(){
		
	    System.out.println("Method2");
	}

	

}
