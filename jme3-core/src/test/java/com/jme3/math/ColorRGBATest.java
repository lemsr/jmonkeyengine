package com.jme3.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class ColorRGBATest {

	@Test
	public void testColors(){
		float red = ColorRGBA.Black.getRed();
		
		assertEquals(0f,red,0f);
	}
	
	@Test
	public void testInterpolate(){
		ColorRGBA newColor = ColorRGBA.Yellow.interpolateLocal(ColorRGBA.Blue, 0.5f);
		assertEquals(0.5f,newColor.getRed(),0f);
		assertEquals(0.5f,newColor.getGreen(),0f);
		assertEquals(1.5f,newColor.getBlue(),0f);
		System.out.println(newColor);
	}
}
