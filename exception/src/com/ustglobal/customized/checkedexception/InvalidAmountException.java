package com.ustglobal.customized.checkedexception;

public class InvalidAmountException extends Exception {
private String message = "Daily limit is 45000";

@Override
public String getMessage() {
	return message;
}
}
