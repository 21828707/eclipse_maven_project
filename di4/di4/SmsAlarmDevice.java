package com.baek.di4;

import org.springframework.stereotype.Component;

@Component("smsAlarmDevice")
public class SmsAlarmDevice implements AlarmDevice {

	@Override
	public void alarm(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "에서 침입 탐지");
	}

}
