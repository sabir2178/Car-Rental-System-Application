package service;

import java.util.Comparator;

import enity.Car;

public class SortByPrice implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}
		else if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}
		return 0;
	}
	

}
