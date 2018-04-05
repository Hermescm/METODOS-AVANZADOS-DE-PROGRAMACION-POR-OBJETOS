public class Facade{
	
	
		private Ampli a = new Ampli();
		private DvdPlayer d = new DvdPlayer();
		private Lights l = new Lights();
		private Tv t = new Tv();
		
		public void WatchTv()
		{
			a.on();
			d.on();
			l.on();
			t.on();
		}
	
}