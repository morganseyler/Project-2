
public class MesoInherit extends MesoAbstract{

	MesoStation mesoStation;
	private int[] stationArray = new int[3];
	
	public MesoInherit(MesoStation mesoStation)
	{
		this.mesoStation = mesoStation;
	}

	@Override
	int[] calAverage() 
	{
		Double sum = 0.0;
		for (int i = 0; i < mesoStation.getStID().length(); i++)
		{
			char character = mesoStation.getStID().charAt(i);
			int ascii = (int) character; 
			sum += ascii;
			
		}
		Double average = sum/4;
		stationArray[0] = (int) (Math.ceil(average));
		stationArray[1] = (int) (Math.floor(average));
		stationArray[2] = (int) (Math.round(average));
		if(Math.round(average) >= average)
		{
			stationArray[2] = (int) (Math.ceil(average));
		}
		else
		{
			stationArray[2] = (int) (Math.floor(average));
		}
		return stationArray;
	}

	@Override
	public char letterAverage() {
		char letterAverage = ((char) calAverage()[2]);
		
		return letterAverage;
	}

}
