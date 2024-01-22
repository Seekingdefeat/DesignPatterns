package com.zhj.creational.singleton_;

/**
 * @author zhj
 * @version 1.0
 * description: 创建型 单例模式 懒汉式
 */
public class LazyStyle {
	private static LazyStyle instance;

	private LazyStyle(){
	}

	public static LazyStyle getInstance() {
		if (instance == null) {
			synchronized (LazyStyle.class) {
				if (instance == null) {
					instance = new LazyStyle();
				}
			}
		}
		return instance;
	}
}
