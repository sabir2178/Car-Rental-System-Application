package app;
import java.util.Scanner;
import implementation.CarRentalServiceImpln;
import service.CarRentalService;

public class CarRentalApp {
	public static void main(String[] args) {
		System.out.println("====welcome Car Rental System======");
		CarRentalService c1=new CarRentalServiceImpln();//upcasting
		Scanner ip = new Scanner(System.in);
		while(true){
			System.out.println("======Menu====");
			System.out.println("1.Add Car\n2.All Details\n3.Enter CarId\n4.sort Details\n5.Sort Car By Price\n6.Sort Car By Fuel Type\n7.Exit");
			int op = ip.nextInt();
			switch(op) {
			case 1:c1.addCar();
			break;
			case 2:c1.allDetails();
			break;
			case 3:c1.findCarById();
			break;
			case 4:c1.sortCarByCid();
			break;
			case 5: c1.sortCarByPrice();
			break;
			case 6: c1.sortCarByFuelType();
			break;
			case 7: System.out.println("=====Thank You Visit Again======");
			System.exit(0);
			break;
			default:System.out.println("Invalid Option!.....");
			
			}
		}
	}

}
