import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class LetterAvg {

	private String[] letterNameArray = null;
	private int countSimilar = 0;
	private int capacity = 2;
	private int numStations = 0;
	private char letterAverage;
	private ArrayList<String> stationId = new ArrayList<String>();

	private String[] nameArray = null;

	public LetterAvg(char letterAverage) throws FileNotFoundException, IOException {
		this.letterAverage = letterAverage;
		loadData();

	}

	private void loadData() throws FileNotFoundException, IOException {

		if (nameArray != null) {
			return;
		}
		nameArray = new String[capacity];
		String filename = "Mesonet.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));

		String lineOfData = br.readLine();
		lineOfData = br.readLine();
		lineOfData = br.readLine();
		lineOfData = br.readLine();
		
		while (lineOfData != null) {

			lineOfData = lineOfData.trim();
			String lineToAdd = lineOfData.substring(0, 4);

			stationId.add(lineToAdd);

			// Get the next line of the file
			lineOfData = br.readLine();
		}

		br.close();
	}

	public int numberOfStationWithLetterAvg() {

		int num = loadLetterData();

		return num;
	}

	public int loadLetterData(){
		char ltr = letterAverage;
		for (int i = 0; i < stationId.size(); i++) {

			if (stationId.get(i).charAt(0) == ltr) {
				countSimilar++;
			}
		}
		return countSimilar;
	}

	public ArrayList<String> loadLetterData1() {
		ArrayList<String> temp = new ArrayList<String>();
		char ltr = letterAverage;

		for (int i = 0; i < stationId.size(); i++) {
			if (stationId.get(i).charAt(0) == ltr) {
				temp.add(stationId.get(i));
			}
		}
		return temp;
	}

	public String toString() {

		ArrayList<String> temp = loadLetterData1();
		String myToString = "\nThey are:";

		for (int i = 0; i < temp.size(); i++) {
			myToString += "\n" + temp.get(i);

		}
		return myToString;
	}

}
