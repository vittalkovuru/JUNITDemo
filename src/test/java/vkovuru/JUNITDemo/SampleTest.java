package vkovuru.JUNITDemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
	
@Test	
	public void simpleTest() {
	
	int a = 2;
	int b = 3;
	assertTrue(a+b==5);
}

@Test	
public void simpleTest_1() {

int a = 3;
int b = 3;
assertTrue(a+b==6);
}
}
