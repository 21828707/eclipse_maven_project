package com.baek.di3;

public class SystemMonitor {
	private long periodTime;
	private SmsSender smsSender;
	
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}
	public void setSmsSender(SmsSender smsSender) {
		this.smsSender = smsSender;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "periodTIme = " + periodTime + ", SmsSender = " + smsSender;
	}
	
	
}
