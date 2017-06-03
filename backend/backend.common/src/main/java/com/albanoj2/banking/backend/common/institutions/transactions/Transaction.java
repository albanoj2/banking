package com.albanoj2.banking.backend.common.institutions.transactions;

import com.albanoj2.banking.backend.common.budget.BudgetItem;
import com.albanoj2.banking.backend.common.money.Money;

public interface Transaction {

	public Money process (Money money);
	public Money getAmount ();
	public BudgetItem getBudgetItem ();
}
