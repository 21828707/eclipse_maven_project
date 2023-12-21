package com.baek.d1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloBeanBoy implements HelloBean {

//	String name;
//	public HelloBeanBoy(String name) {
//		// TODO Auto-generated constructor stub
//		this.name = name;
//	}
//	
//	@Override
//	public void printHello(String name) {
//	public void printHello() {
//		// TODO Auto-generated method stub
//		System.out.println(name);
//	}

	
	
	 String msg; Boy boy;
	 
	 /* public HelloBeanBoy(String msg, Boy boy) { // TODO Auto-generated constructor
	 * stub this.msg = msg; this.boy = boy; }
	 */
	
	
/*	public void printHello() {}
		// TODO Auto-generated method stub
		System.out.println(msg + " Boy " + boy.getName());
		
		System.out.println("========myMap=========");
		Map<String, String> myMap = boy.getMyMap();
		
		Set<String> entryKey = myMap.keySet();
		
		Iterator<String> it = entryKey.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " = " + myMap.get(key));
		}
		
		System.out.println("========myProp=========");
		Properties myProp = boy.getMyProp();
		
		Enumeration<String> propertyNames = (Enumeration<String>)myProp.propertyNames();
		while(propertyNames.hasMoreElements()) {
			String propertyName = propertyNames.nextElement();
			System.out.println(propertyName + " = " + myProp.getProperty(propertyName));
		}
		
		System.out.println("=========mySet=========");
		Set<String> mySet = boy.getMySet();
		
		it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=========myList==========");
		List<String> myList = boy.getMyList();
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}*/
	
//	private static HelloBeanBoy instance;
//	public static HelloBeanBoy getInstance() {
//		System.out.println("getInstance");
//		
//		if(instance == null) {
//			instance = new HelloBeanBoy();
//		}
//		return instance;
//	}
	
	
	 /* public void setBoy(Boy boy) { this.boy = boy; }
	  * autowire 설정을 위한 set메소드
	 */
	
	public HelloBeanBoy(Boy boy) {
		// TODO Auto-generated constructor stub
		this.boy = boy;
	} // autowire = "constructor"
	
	@Override
	public void printHello() {
		System.out.println("name = " + boy.getName());
	}
}
