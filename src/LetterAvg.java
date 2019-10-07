
public class LetterAvg {

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
		
		int countSimilar = 0;
		
		for(int i = 0; i < nameArray.length; i++)
		{
			if(nameArray[i].substring(0) == ("I"))
			{
				countSimilar++;
			}
		}
		return Integer.toString(countSimilar);
	}
	
	
}
