import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LetterAvg{

	private String[] letterNameArray = null;
	private int countSimilar = 0;
	private int capacity = 2;
	private int numStations = 0;
	private char letterAverage;

	private String[] nameArray = null;

	
	public LetterAvg(char letterAverage) {
		this.letterAverage = letterAverage;
		
	}

	private void loadData() throws FileNotFoundException, IOException {
		
		if(nameArray != null)
		{
			return;
		}
		
		nameArray = new String[capacity];
		String filename = "Mesonet.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int count = 0;
    	String lineOfData = br.readLine();	

		while (lineOfData!=null)
    	{
    		count++;
    		if(count > 3)
    		{
    			String name = lineOfData.substring(1, 5);
				//System.out.println(name);
				addElement(name);
    		}

			// Get the next line of the file
			lineOfData = br.readLine();
    	}
		
		br.close();
	}
	private void expandArray()
    {
    	capacity = capacity*2;
    	String[] tempArray = new String[capacity];
    	
    		for (int i = 0; i < numStations; i++)
    		{
    			tempArray[i] = nameArray[i];
    		}
    		nameArray = tempArray;
    		
    }
	
    public void addElement(String name)
    {
    	
    	if (numStations == capacity)
    	{
    		expandArray();
    	}
    	
    	nameArray[numStations] = name;
    	
    	numStations++;
    }

	public int numberOfStationWithLetterAvg() throws FileNotFoundException, IOException {

		loadLetterData();

		return countSimilar;
	}

	private void loadLetterData() throws FileNotFoundException, IOException {
		loadData();
		if(letterNameArray != null)
		{
			return;
		}
		
		letterNameArray = new String[20];
		char ltr = letterAverage;
		
		for(int i = 0; i < nameArray.length; i++)
		{
			
			String name = nameArray[i];
			if(name == null)
			{
				break;
			}
				if(name.charAt(0) == ltr)
				{
					letterNameArray[countSimilar] = name;
					countSimilar++;
				}
		}
	}
	
	public String toString()
	{
		StringBuffer buff = new StringBuffer();
		for(int i = 0; i < letterNameArray.length; i++)
		{
			if(letterNameArray[i] == null)
			{
				break;
			}
			buff.append("\n").append(letterNameArray[i]);
		}
		return "\nThey are:" + buff.toString();
	}
	
	
}
