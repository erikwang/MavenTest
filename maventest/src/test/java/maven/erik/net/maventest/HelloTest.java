package maven.erik.net.maventest;

import static org.junit.Assert.assertEquals; 

import org.junit.Test;

public class HelloTest {
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String result = hello.getVersion();
		assertEquals("1.0",result);
	}
}
