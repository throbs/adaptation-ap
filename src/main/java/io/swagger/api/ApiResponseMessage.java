package io.swagger.api;

import javax.xml.bind.annotation.XmlTransient;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T17:20:01.502+08:00")

@javax.xml.bind.annotation.XmlRootElement		//XmlRootElement便于对象与xml文件之间的转换
public class ApiResponseMessage {
	public static final int ERROR = 1;
	public static final int WARNING = 2;
	public static final int INFO = 3;
	public static final int OK = 4;
	public static final int TOO_BUSY = 5;

	int code;
	String type;
	String message;
	
	public ApiResponseMessage(){}
	
	public ApiResponseMessage(int code, String message){
		this.code = code;
		switch(code){
		case ERROR:
			setType("error");
			break;
		case WARNING:
			setType("warning");
			break;
		case INFO:
			setType("info");
			break;
		case OK:
			setType("ok");
			break;
		case TOO_BUSY:
			setType("too busy");
			break;
		default:
			setType("unknown");
			break;
		}
		this.message = message;
	}

	@XmlTransient		//注解解决 JavaBean 属性名称与字段名称之间的名称冲突，或者用于防止字段/属性的映射
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
