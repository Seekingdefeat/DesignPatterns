package com.zhj.creational.singleton_;

import org.junit.jupiter.api.Test;

/**
 * @author zhj
 * @version 1.0
 * description:
 */
class HungryStyleTest {

	@Test
	public void tAddress() {
		HungryStyle instance = HungryStyle.getInstance();
		HungryStyle instanceCopy = HungryStyle.getInstance();
		System.out.println(instanceCopy == instance);
	}
}