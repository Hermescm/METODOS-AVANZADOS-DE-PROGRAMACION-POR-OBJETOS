public class CatDogAdapter implements Dog{
	private Cat myCat;
	
	
	public CatDogAdapter(Cat myCat) {
		this.myCat = myCat;
	}
	
	public void bark() {
		// TODO Auto-generated method stub
		myCat.prr();
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		myCat.knife();
	}

}