package vkovuru.JUNITDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUNITDemo {
	public static void main(String[] args) {
	System.out.println("JUNIT Demo Project");	
	}
@Test
	public void simpleTest() {
		int a = 1;
		int b = 2;
	  System.out.println(a + b);
		assertTrue(a+b  == 3);
	}
}
