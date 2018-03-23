package pkg;

public class Client5 {
	public void fall() {
		System.out.println("-->Client5.fall()");
		ProviderManager pMan1 = ProviderManager.getManager();
		// Get some providers and call their service
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Provider p1 = pMan1.getProvider(this);
		if(p1==null) {
			System.out.println("Tried to get provider, but none available");
		}
		else {
			System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		}
	}
}
