import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PosAvg {
	
	public String stId;
	private int numStations = 0;
	private int capacity = 2;
	private String[] nameArray = new String[capacity];
	private int stIdIndex = -1;

	public PosAvg(String stId)
	{
		MesoStation meso = new MesoStation(stId);
		this.stId = meso.getStID();
	}
	
	public int indexOfStation() throws IOException
	{
    	String filename = "Mesonet.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int indexCounter = 0;
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
				if(stId.equals(name))
				{
					stIdIndex = indexCounter;
				}
    			indexCounter++;
    		}

			// Get the next line of the file
			lineOfData = br.readLine();
    	}
		
		br.close();
		return stIdIndex;
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
    
    public String toString()
    {
    	return "This index is average of " + nameArray[stIdIndex-1] + " and " + nameArray[stIdIndex+1] + ", " +
    			nameArray[stIdIndex-2] + " and " + nameArray[stIdIndex+2];
    }
}
