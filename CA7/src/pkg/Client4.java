package pkg;

public class Client4 {
	public void spin() {
		System.out.println("-->Client4.spin()");
		ProviderManager pMan1 = ProviderManager.getManager();
		// Get some providers and call their service
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Provider p1 = pMan1.getProvider(this);
		if(p1==null) {
			System.out.println("No provider available");
		}
		else {
			System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		}
	}
}
