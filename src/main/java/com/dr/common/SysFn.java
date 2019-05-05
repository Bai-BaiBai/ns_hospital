package com.dr.common;

public class SysFn implements Const {

	private SysFn() {
	}

	/*
	 * 判断字符串是否为null或空字符串
	 */
	public static boolean isNullOrSpace(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}
}
