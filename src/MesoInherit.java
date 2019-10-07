
public class MesoInherit extends MesoAbstract{

	MesoStation mesoStation;
	
	public MesoInherit(MesoStation mesoStation)
	{
		this.mesoStation = mesoStation;
	}

	@Override
	int[] calAverage() {
		int[] stationArray = new int[3];
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
		stationArray[2] = new Double(Math.round(average)).intValue();
		if(Math.round(average) >= average)
		{
			stationArray[2] = new Double(Math.ceil(average)).intValue();
		}
		else
		{
			stationArray[2] = new Double(Math.floor(average)).intValue();
		}
		return stationArray;
	}

	@Override
	public char letterAverage() {
		

		return 0;
	}

}
