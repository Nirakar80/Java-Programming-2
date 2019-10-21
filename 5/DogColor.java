
public enum DogColor {
	BLACK, WHITE, GREY, BROWN, MIX;
	

	public static String [] colors()
	{
		DogColor[] color = values();
		String[] colors = new String[color.length];
		
		for (int i = 0; i < color.length; i++)
		{
			colors[i] =color[i].name();
		}
		
		return colors;
	}
	
}
