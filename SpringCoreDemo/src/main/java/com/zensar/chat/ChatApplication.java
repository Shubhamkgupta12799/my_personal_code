package com.zensar.chat;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChatApplication {
 
	Map<String, Set<String>> userMap;
	Map<String , List<String>> messageMap;
	public ChatApplication(Map<String, Set<String>> userMap, Map<String, List<String>> messageMap) {
		super();
		this.userMap = userMap;
		this.messageMap = messageMap;
	}
	public ChatApplication() {
		super();
	}
	public Map<String, Set<String>> getUserMap() {
		return userMap;
	}
	public void setUserMap(Map<String, Set<String>> userMap) {
		this.userMap = userMap;
	}
	public Map<String, List<String>> getMessageMap() {
		return messageMap;
	}
	public void setMessageMap(Map<String, List<String>> messageMap) {
		this.messageMap = messageMap;
	}
	@Override
	public String toString() {
		return "ChatApplication [userMap=" + userMap + ", messageMap=" + messageMap + "]";
	}
	
	
}
