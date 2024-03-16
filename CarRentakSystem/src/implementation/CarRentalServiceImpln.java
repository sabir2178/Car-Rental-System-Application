package implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import enity.Car;
import service.CarRentalService;
import service.SortByPrice;
import service.SortCarByFuelType;

public class CarRentalServiceImpln  implements CarRentalService{
	ArrayList<Car> l1= new ArrayList<Car>();
	Scanner ip = new Scanner(System.in);
	@Override
	public void addCar() {
		System.out.println("===Please Enter The Below Car Details=====");
		System.out.println("enter the carId");
		int carid=ip.nextInt();
		System.out.println("Enter your Brand Name");
		String bname=ip.next();
		System.out.println("Enter the Color");
		String color=ip.next();
		System.out.println("Enter the price");
		double price=ip.nextDouble();
		System.out.println("enter the fuel type");
		String ft=ip.next();
		System.out.println("enter the model");
		int model=ip.nextInt();
		System.out.println("Enter the milage");
		int milage=ip.nextInt();
		
		l1.add(new Car(carid,bname, color, price, ft, milage, milage));
		System.out.println("=====Deatils had been Saved==========");
		
	}
	
	@Override
	public void allDetails() {
		System.out.println("=======Car Details==========");
		int c=0;
		for(Car ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Data Found");
		}
		
	}
	@Override
	public void findCarById() {
		System.out.println("please enter the Car id");
		int id=ip.nextInt();
		int c=0;
		for(Car c1:l1) {
			if(c1.getCid()==id) {
				System.out.println(c1);
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("id not found");
		}
	}

	@Override
	public void sortCarByCid() {
		Collections.sort(l1);
		System.out.println("=======Car Details==========");
		int c=0;
		for(Car ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Data Found");
		}
		
	}

	@Override
	public void sortCarByPrice() {
		Collections.sort(l1,new SortByPrice());
		System.out.println("=======Car Details==========");
		int c=0;
		for(Car ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Data Found");
		}
		
	}

	@Override
	public void sortCarByFuelType() {
		Collections.sort(l1, new SortCarByFuelType());
		System.out.println("=======Car Details==========");
		int c=0;
		for(Car ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Data Found");
		}
		
	}
	

}
