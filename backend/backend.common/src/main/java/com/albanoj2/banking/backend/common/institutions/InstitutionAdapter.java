package com.albanoj2.banking.backend.common.institutions;

import com.albanoj2.banking.backend.common.plugin.LoadContext;
import com.albanoj2.banking.backend.common.plugin.UnloadContext;

public abstract class InstitutionAdapter implements Institution {

	public void onLoad(LoadContext context) {}
	public void onUnload(UnloadContext context) {}
}
