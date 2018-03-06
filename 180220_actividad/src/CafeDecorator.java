public class CafeDecorator implements Cafe {

	protected Cafe caf;
	
	public CafeDecorator(Cafe c){
		this.caf=c;
	}
	
	@Override
	public void combinar() {
		this.caf.combinar();
	}

}