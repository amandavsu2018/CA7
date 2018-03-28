package pkg;

public class Provider {

	public void service(Client c, Foo foo) throws RuntimeException {
		if (ProviderManager.map.get(c).equals(this)) {
			foo.increment();
		}
	}

	public void release(Client c) {
		if (ProviderManager.map.containsKey(c)) {
			ProviderManager.map.remove(c);
		}
	}
}
