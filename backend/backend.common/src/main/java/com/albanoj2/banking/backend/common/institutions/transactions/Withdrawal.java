package com.albanoj2.banking.backend.common.institutions.transactions;

import com.albanoj2.banking.backend.common.money.Money;

public abstract class Withdrawal implements Transaction {

	public Money process(Money money) {
		return money.subtract(this.getAmount());
	}
}
