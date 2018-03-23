package pkg;

public class Client3 implements Client {
	public void walk() {
		System.out.println("-->Client3.walk()");
		ProviderManager pMan1 = ProviderManager.getManager();
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Provider p1 = pMan1.getProvider(this);
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Foo f1 = new Foo();
		p1.service(this, f1);
		System.out.println("f1: " + f1);
	}
}
