package com.ba.dto;

import java.io.Serializable;




public class Dto implements Serializable {
	private String Key;
	private Integer Value;
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public Integer getValue() {
		return Value;
	}
	public void setValue(Integer value) {
		Value = value;
	}
	
	

}
