package com.ustglobal.customized.checkedexception;

public class ValidateAmount {
	void checkAmount(int amount) throws InvalidAmountException {
		
		if(amount > 45000) {
			
			throw new InvalidAmountException();
		}
	}
}
