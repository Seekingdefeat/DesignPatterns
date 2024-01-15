package com.zhj.creational.singleton;

import com.zhj.model.Student;

/**
 * @author zhj
 * @version 1.0
 * description: 创建型 单例模式 饿汉式
 */
public class HungryStyle {
	private static final HungryStyle instance = new HungryStyle();

	private HungryStyle() {
	}

	public static HungryStyle getInstance() {
		return instance;
	}
}
