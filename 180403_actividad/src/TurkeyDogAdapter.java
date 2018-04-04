public class TurkeyDogAdapter implements Dog{
	private Turkey pollo;
	
	public TurkeyDogAdapter(Turkey pollo) {
		this.pollo = pollo;
	}
	@Override
	public void bark() {
		pollo.gorgo();
		
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		pollo.gorgo();
	}

}
