
public enum DogBreed {
	LABRADOR, GERMANSHEPERD, BEAGLE, MASTIFF, HUSKY;
	
	public static String [] breeds()
	{
		DogBreed[] breed = values();
		String[] breeds = new String[breed.length];
		
		for (int i = 0; i < breed.length; i++)
		{
			breeds[i] =breed[i].name();
		}
		
		return breeds;
	}

}
