package com.example.demo.cart.exception;

//自訂例外-找不到
public class AddException extends RuntimeException {
	public AddException(String message) {
		super(message);
	}
}
