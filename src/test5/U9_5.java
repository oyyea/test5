package test5;

import java.util.GregorianCalendar;

public class U9_5 {
	GregorianCalendar x=new GregorianCalendar();
	public void getNow() {
		System.out.println(x.get(GregorianCalendar.YEAR)+"��"
				+x.get(GregorianCalendar.MONTH)+"��"
				+x.get(GregorianCalendar.DAY_OF_MONTH)+"��");
	}
	public void getChange() {
		x.setTimeInMillis(1234567898765L);
		System.out.println(x.get(GregorianCalendar.YEAR)+"��"
				+x.get(GregorianCalendar.MONTH)+"��"
				+x.get(GregorianCalendar.DAY_OF_MONTH)+"��");
	}

}
