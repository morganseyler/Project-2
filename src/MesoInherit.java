
public class MesoInherit extends MesoAbstract{

	MesoStation mesoStation;
	
	public MesoInherit(MesoStation mesoStation)
	{
		this.mesoStation = mesoStation;
	}

	@Override
	int[] calAverage() {
		int[] stationArray = new int[2];
		Double sum = 0.0;
		for (int i = 0; i < mesoStation.getStID().length(); i++)
		{
			char character = mesoStation.getStID().charAt(i);
			int ascii = (int) character; 
			sum += ascii;
			
		}
		Double average = sum/4;
		stationArray[0] = new Double(Math.ceil(average)).intValue();
		stationArray[1] = new Double(Math.floor(average)).intValue();
		
		if()
		{
			
		}
		return null;
	}

	@Override
	public char letterAverage() {
		

		return 0;
	}

}
