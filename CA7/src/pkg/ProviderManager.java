package pkg;

public class ProviderManager {

	private static ProviderManager uniqueInstance;

	Provider[] providers = new Provider[3];

	private ProviderManager() { }

	public static ProviderManager getManager() {
		if (uniqueInstance == null) {
			uniqueInstance = new ProviderManager();
		}
		return uniqueInstance;
	}

	//don't forget to edit this
	public Provider getProvider(Client c) {
		
	}
	
	public int numProvidersAvailable() {
		int count = 0;
		for(Provider p : providers) {
			count++;
		}
		return count;
	}
}
