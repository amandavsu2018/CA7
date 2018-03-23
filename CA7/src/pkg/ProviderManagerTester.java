package pkg;

public class ProviderManagerTester {
	public static void main(String[] args) {
		Client1 c1 = new Client1();
		c1.go();
		Client2 c2 = new Client2();
		c2.run();
		Client3 c3 = new Client3();
		c3.walk();
		Client4 c4 = new Client4();
		c4.spin();
		Client5 c5 = new Client5();
		c5.fall();
	}
}
