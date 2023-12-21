package com.baek.d1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Boy {
	// map 주입 변수 -> set메소드 필수
	private Map<String, String> myMap;
	private Properties myProp;
	private Set<String> mySet; // property name과 변수 이름이 같아야 한다.
	private List<String> myList;
	
	
	//DI 방식
//	String name = "이백승";
	
	//setter방식
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProp() {
		return myProp;
	}

	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}

	public Set<String> getMySet() {
		return mySet;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	
}
