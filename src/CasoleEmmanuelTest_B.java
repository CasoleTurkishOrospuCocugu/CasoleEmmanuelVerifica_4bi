import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class CasoleEmmanuelTest_B {
	CasoleEmmanuelClass c;
	
	@Before
	void before() {
		c = new CasoleEmmanuelClass();
	}
	
	@Test
	void test1() {
		CasoleEmmanuelClass c = new CasoleEmmanuelClass();
		int risAtteso= 210;
		int risOttenuto= c.casoleMet(5, 7);
		assertEquals(risAtteso, risOttenuto);

	}
	
	@Test
	void test2() {
		CasoleEmmanuelClass c = new CasoleEmmanuelClass();
		int risAtteso= 24;
		int risOttenuto= c.casoleMet(2, 4);
		assertEquals(risAtteso, risOttenuto);
	
}
	
	@Test
	void test() {
		CasoleEmmanuelClass c = new CasoleEmmanuelClass();
		int risAtteso= 60 ;
		int risOttenuto= c.casoleMet(3, 5);
		assertEquals(risAtteso, risOttenuto);
	}
	
}
