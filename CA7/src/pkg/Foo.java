package pkg;

public class Foo {
	private int bit=0;
	public Foo() {
	}
	public int getBits() {
		return bit;
	}
	public void increment() {
		bit++;
	}
	@Override
	public String toString() {
		return "bit=" + bit;
	}
}
