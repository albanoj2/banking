package com.albanoj2.banking.backend.common.budget;

import com.albanoj2.banking.backend.common.Identifier;
import com.albanoj2.banking.backend.common.money.Money;

public interface BudgetItem {

	public Money getAmount ();
	public Identifier getId ();
}
