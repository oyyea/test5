package test5;

import java.util.Random;

public class U9_4 {
	public void setRand() {
		Random r=new Random(1000);
		for(int i=0;i<50;i++) {
			System.out.println(r.nextInt(100));
		}
	}
}
