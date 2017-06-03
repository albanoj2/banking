package com.albanoj2.banking.backend.common.institutions;

import java.util.stream.Stream;

import com.albanoj2.banking.backend.common.Identifier;
import com.albanoj2.banking.backend.common.institutions.transactions.Transaction;
import com.albanoj2.banking.backend.common.plugin.Plugin;

public interface Institution extends Plugin {

	public Identifier getId ();
	public String getName ();
	public Transaction getTransaction (Identifier id);
	public Stream<Transaction> getTransactions ();
}
