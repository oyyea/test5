package test5;

import java.util.Date;

public class StopWatch {
	Date startTime,endTime;
	StopWatch(){
		startTime=new Date();
	}
	
	public void start() {
		startTime=new Date();
	}
	
	public void stop() {
		endTime=new Date();
	}
	
	public long getElapsedTime() {
		return endTime.getTime()-startTime.getTime();
	}
}
