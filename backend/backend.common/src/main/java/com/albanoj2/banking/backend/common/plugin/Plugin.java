package com.albanoj2.banking.backend.common.plugin;

public interface Plugin {

	public void onLoad (LoadContext context);
	public void onUnload (UnloadContext context);
}
