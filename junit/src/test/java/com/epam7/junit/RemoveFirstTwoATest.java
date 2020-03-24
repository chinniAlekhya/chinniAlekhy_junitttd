package com.epam7.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveFirstTwoATest {
//    To Do List 
//    1. 1chars A = "" -done
//    2. 2chars AA = "" - done
//    3. 2chars AB = B - done
//    4. 4chars AABB = BB - done
//    5. nchars ABCDBL = BCDBL - done
    
	@Test
	void test1char() {
		RemoveFirstTwoA removeFirst2A = new RemoveFirstTwoA();
		String result = removeFirst2A.removea("A");
		assertEquals("",result);
	}
	@Test
	void test2chars() {
		RemoveFirstTwoA removeFirst2A = new RemoveFirstTwoA();
		String result = removeFirst2A.removea("AB");
		assertEquals("B",result);
	}
	@Test
	void test4chars() {
		RemoveFirstTwoA removeFirst2A = new RemoveFirstTwoA();
		String result = removeFirst2A.removea("AABB");
		assertEquals("BB",result);
	}
	@Test
	void testnchars() {
		RemoveFirstTwoA removeFirst2A = new RemoveFirstTwoA();
		String result = removeFirst2A.removea("ABCDBL");
		assertEquals("BCDBL",result);
	}
}
