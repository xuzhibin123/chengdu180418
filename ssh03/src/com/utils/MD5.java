package com.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.jboss.jandex.Main;

//base64反向解密
//md5不可逆加密算法
public class MD5 {
	public static String encrypty(String source) {
		MessageDigest md = null;
		StringBuffer sb = new StringBuffer();
		try {
			md = MessageDigest.getInstance("md5");
			byte[] result = md.digest(source.getBytes());//加密了
		
			for(byte b: result){
				int number = b & 0xff;
				String str = Integer.toHexString(number);
				if(str.length()==1){
					sb.append("0");
				}
				sb.append(str);
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString().toUpperCase();
	}
	public static void main(String[] args) {
		System.out.println(MD5.encrypty("654321"));
	}
}
