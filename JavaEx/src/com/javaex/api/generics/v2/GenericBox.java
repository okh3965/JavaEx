package com.javaex.api.generics.v2;

public class GenericBox<T> {	// <템플릿문자>
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
