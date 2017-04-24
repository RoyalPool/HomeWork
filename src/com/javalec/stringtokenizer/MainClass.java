package com.javalec.stringtokenizer;

import java.util.StringTokenizer;
public class MainClass {
	public static void main(String[] args) {
		String str1="���� ������ �ſ� ��� ���� ���� �ֽ��ϴ�.";
		String str2="2015/11/16";
	StringTokenizer tokenizer1=new StringTokenizer(str1);
	StringTokenizer tokenizer2=new StringTokenizer(str2, "/");
	
	while(tokenizer1.hasMoreTokens()){
		System.out.println(tokenizer1.nextToken());
	}
	
	while(tokenizer2.hasMoreTokens()){
		System.out.println(tokenizer2.nextToken());
	}
	}
}
