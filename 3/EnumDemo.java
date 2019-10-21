
public class EnumDemo 
{
	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY } 
	
	
	public static void main(String[] args) 
	{
		Day workDay = Day.WEDNESDAY;
		
		System.out.println(workDay);
		
		System.out.println("The ordinal value for " + Day.SUNDAY 
				+ " is "+ Day.SUNDAY.ordinal());
		
		if(Day.FRIDAY.compareTo(Day.MONDAY)>0)
		{
			System.out.println(Day.FRIDAY +" is greater than "+Day.MONDAY);
		}
		else
		{
			System.out.println(Day.MONDAY +" is greater than "+Day.FRIDAY);
		}
	}

}
