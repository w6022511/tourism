/*
 * RegexUtils.java created on 2014年11月21日 上午11:11:51 by 谢清
 */

package org.eking.tourism.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式工具类
 * TODO javadoc for org.eking.framework.utils.RegexUtils
 * @Copyright: 2014海南易建科技股份有限公司
 * @author: 谢清
 * @since: 2014年11月21日
 */
public class RegexUtils {

	/**
	 * 身份证
	 * @creator: xie-qing
	 * @createDate: 2014年11月21日 
	 * @modifier:
	 * @modifiedDate:
	 * @param idCard
	 * @return
	 */
	public static boolean isIdCard(String idCard) {
		
		//定义判别用户身份证号的正则表达式（要么是15位，要么是18位，最后一位可以为字母）  
		Pattern idCardPattern = Pattern.compile("(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])");
		
		//通过Pattern获得Matcher  
		Matcher idCardMatcher = idCardPattern.matcher(idCard);

		return idCardMatcher.matches();
	}
	
	public static void main(String[] args) {
		System.out.println(isIdCard("aaaa"));
		System.out.println(isIdCard("46000319811010243X"));
		System.out.println(isIdCard("46000319811010243y"));
		System.out.println(isIdCard("46000319811010243x"));
		System.out.println(isIdCard("46000319811010243x1"));
	}
}
