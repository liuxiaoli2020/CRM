package com.sc.entity;

import java.io.Serializable;

public class Message implements Serializable {

	private String msgCode;
	private String msgStauts;
	private String msgContent;
	public Message() {
		super();
	}
	public Message(String msgCode, String msgStauts, String msgContent) {
		super();
		this.msgCode = msgCode;
		this.msgStauts = msgStauts;
		this.msgContent = msgContent;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgStauts() {
		return msgStauts;
	}
	public void setMsgStauts(String msgStauts) {
		this.msgStauts = msgStauts;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	@Override
	public String toString() {
		return "Message [msgCode=" + msgCode + ", msgStauts=" + msgStauts + ", msgContent=" + msgContent + "]";
	}
	
	
	
}
