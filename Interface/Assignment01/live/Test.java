package live;

import Music.string.Veena;
import Music.wind.Saxophone;
import Music.Playble;

public class Test {
	public static void main(String[] args) {
		Veena v = new Veena();
		Saxophone s  = new Saxophone();
		v.play();
		s.play();
		System.out.println();
		Playble ob1 = new Veena();
		Playble ob2 = new Saxophone();
		ob1.play();
		ob2.play();
		
	}
}
