package org.openfact.representations.info;

import java.util.Map;

public class SpiInfoRepresentation {

	private boolean internal;

	private Map<String, ProviderRepresentation> providers;

	public boolean isInternal() {
		return internal;
	}

	public void setInternal(boolean internal) {
		this.internal = internal;
	}

	public Map<String, ProviderRepresentation> getProviders() {
		return providers;
	}

	public void setProviders(Map<String, ProviderRepresentation> providers) {
		this.providers = providers;
	}

}
