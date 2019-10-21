
public class SportsCarDemo 
{

	public static void main(String[] args) 
	{
		SportsCar yourNewCar = new SportsCar(CarType.JAGUAR, CarColor.BLACK, 250000);
		
		System.out.println(yourNewCar);
		
		switch(yourNewCar.getMake())
		{
		case HONDA:
			System.out.println("Your car was Made in US.");
			break;
		case TOYOTA:
			System.out.println("Your car was Made in Japan.");
			break;
		case PORSCHE:
			System.out.println("Your car was Made in Germany.");
			break;
		case JAGUAR:
			System.out.println("Your car was Made in England.");
			break;
		default:
			System.out.println("I'm not sure where your car was made.");
		}
		
	}

}
