package test5;

import java.util.Date;

public class U9_3 {
	Date time=new Date();
	
	public void selfInput() {
		for(long i=10000;i<=1e11;i*=10) {
			time.setTime(i);
			System.out.println(time.toString());
		}
	}
}
