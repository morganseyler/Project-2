
public class LetterAvg{
	private MesoInherit mesoInherit = null;
	public MesoInherit getMesoInherit() {
		return mesoInherit;
	}

	public void setMesoInherit(MesoInherit mesoInherit) {
		this.mesoInherit = mesoInherit;
	}

	private String[] nameArray = null;

	public LetterAvg(char letterAverage) {
		// TODO Auto-generated constructor stub
	}

	public String[] getNameArray() {
		return nameArray;
	}

	public void setNameArray(String[] nameArray) {
		this.nameArray = nameArray;
	}

	public int numberOfStationWithLetterAvg() {
		//int asciiValue = nameArray[2];
		char ltr = mesoInherit.letterAverage();
		int countSimilar = 0;
		String currentPos = null;
		for(int i = 0; i < nameArray.length; i++)
		{
			
			String name = nameArray[i];
			if(name == null)
			{
				break;
			}
	
				if(name.charAt(0) == ltr)
				{
	
					countSimilar++;
					
				}
			
			
		}

		return countSimilar;
		
		/*
		for(int i = 0; i < nameArray.length; i++)
		{
			currentPos = nameArray[i];
			countSimilar++;
		}
		return currentPos;
		*/

	}
	
	public String toString()
	{
		return "\nThey are:\n";
	}
	
	
}
