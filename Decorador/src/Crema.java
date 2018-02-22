public class Crema extends CafeDecorator {

	public Crema(Cafe c) {
		super(c);
	}
	
	@Override
	public void combinar(){
		super.combinar();
		System.out.print(" Poniendo Crema");
	}
}