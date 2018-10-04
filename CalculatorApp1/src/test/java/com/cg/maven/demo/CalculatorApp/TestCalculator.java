package com.cg.maven.demo.CalculatorApp;


import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	
	@Test
	public void testAdd(){
	Calculator c1=new Calculator();
	int res=c1.add(3,6);
	Assert.assertEquals(9,res);
	}

	@Test
	public void testSubtract(){
		Calculator c2=new Calculator();
		int res=c2.subtract(7,3);
		Assert.assertEquals(4,res);
	}
	@Test
	public void testMultiply(){
		Calculator c3=new Calculator();
		int res=c3.multiply(4,2);
		Assert.assertEquals(8,res);
	}
	
	@Test
	public void testDivide(){
		Calculator c4=new Calculator();
		double res=c4.divide(4,2);
		Assert.assertEquals(2,(int)res);
	}




}
