package pkg;

public class Client2 {
	public void run() {
		System.out.println("-->Client2.run()");
		ProviderManager pMan1 = ProviderManager.getManager();
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Provider p1 = pMan1.getProvider(this);
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		Foo f1 = new Foo();
		p1.service(this,f1);
		System.out.println("f1: " + f1);
		p1.release(this);
		System.out.println("Num providers available: " + pMan1.numProvidersAvailable());
		try {
			p1.service(this, f1);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
	}
}

