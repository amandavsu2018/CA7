package pkg;

import java.util.HashMap;

public class ProviderManager {

	private static ProviderManager uniqueInstance;

	public static HashMap<Object, Provider> map = new HashMap<>();

	private ProviderManager() {
	}

	public static ProviderManager getManager() {
		if (uniqueInstance == null) {
			uniqueInstance = new ProviderManager();
		}
		return uniqueInstance;
	}

	public Provider getProvider(Client c) {
		int numProviders = numProvidersAvailable();
		if (numProviders > 0 && numProviders < 4) {
			Provider p = new Provider();
			map.put(c, p);
			return p;
		} else {
			return null;
		}
	}

	public int numProvidersAvailable() {
		return 3 - map.size();
	}
}
