public class Latte extends CafeDecorator {

	public Latte(Cafe c) {
		super(c);
	}

	@Override
	public void combinar(){
		super.combinar();
		System.out.print(" Poniendo Latte");
	}
}