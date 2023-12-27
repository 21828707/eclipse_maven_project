package com.baek.di4;

import org.springframework.stereotype.Component;

@Component("displayStrategy")
public class DefaultDisplayStrategy implements DisplayStrategy {

	@Override
	public DisplayType getDislpayStrategy() {
		// TODO Auto-generated method stub
		return DisplayType.GRID;
	}

}
