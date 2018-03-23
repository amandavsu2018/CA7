package pkg;

public class Client1 {
	public void go() {
		System.out.println("-->Client1.go()");
		ProviderManager pMan1 = ProviderManager.getManager();
		// Verify that ProviderManager is a singleton.
		ProviderManager pMan2 = ProviderManager.getManager();
		System.out.println("pMan1.equals(pMan2)=" + pMan1.equals(pMan2));
		// Get some providers and call their service
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Provider p1 = pMan1.getProvider(this);
		if(p1==null) {
			System.out.println("No provider available");
		}
		else {
			System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
			Foo f1 = new Foo();
			p1.service(this,f1);
			System.out.println("f1: " + f1);
			p1.service(this,f1);
			System.out.println("f1: " + f1);
		}
	}
}
