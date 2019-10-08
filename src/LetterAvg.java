
public class LetterAvg{

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

	public String numberOfStationWithLetterAvg() {
		MesoInherit letter = new MesoInherit(null);
		int countSimilar = 0;
		String currentPos = null;

		for(int i = 0; i < nameArray.length; i++)
		{
			//equals(nameArray[i].substring(0,1)
			if(letter.letterAverage() == nameArray[i].charAt(1))
			{
				countSimilar++;
				if(letter.letterAverage() != nameArray[i].charAt(1))
						{
							i = nameArray.length;
						}
			}
		}

		return Integer.toString(countSimilar);
		
		/*
		for(int i = 0; i < nameArray.length; i++)
		{
			currentPos = nameArray[i];
			countSimilar++;
		}
		return currentPos;
		*/
	}
	
	
}
