package service;
import java.util.Comparator;

import enity.Car;

public class SortCarByFuelType implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getFuelType().compareTo(o2.getFuelType());
	}
	

}
