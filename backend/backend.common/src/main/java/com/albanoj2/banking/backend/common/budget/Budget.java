package com.albanoj2.banking.backend.common.budget;

import java.util.stream.Stream;

public interface Budget {

	public Stream<BudgetItem> getBudgetItems ();
}
