# Project-2
Project 2 implemented abstraction through methods/classes and also performs ASCII conversions.
## Problem Solving Approach
To start the project I first added all of the methods in MesoInherit that extend the MesoAbstract class. I then individually worked on each class by creating each method in the class to output or complete the specified task. At the beginning of the project I started off with using arrays then as the project progressed I changed to ArrayList for an easier use of insertion and list expansion.
# LetterAvg Class
public class LetterAvg 
### Imports and Variables
```
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

private int countSimilar = 0;
private int capacity = 2;
private char letterAverage;
private ArrayList<String> stationId = new ArrayList<String>();
```
### Methods
```
public LetterAvg(char letterAverage) throws FileNotFoundException, IOException 
```
  The constructor for LetterAvg. Passes in letterAverage char variable and asigns it to letterAverage. Calls loadDate() method.
```
private void loadData() throws FileNotFoundException, IOException
```
  Loads the lines of data from Mesonet.txt into a string, then places the substring of that line of data into the ArrayList
```  
public int numberOfStationWithLetterAvg()
```
  returns an int of the number of stations with the letter avg
```
public ArrayList<String> loadLetterData() 
```
  Uses a for loop to check if the stationId in the ArrayList is the same then returns an int countSimilar
```
public String toString() 
```
  returns the toString for loadLetterData


# MesoAbstract Class
public abstract class MesoAbstract 
### Methods
```
abstract int[] calAverage();
```
  Abstract method calAverage to return integer array.
```
public abstract char letterAverage();
```
  Create an abstract method letterAverage with return type char


# MesoInherit Class
public class MesoInherit extends MesoAbstract
### Imports and Variables
```
MesoStation mesoStation;
private int[] stationArray = new int[3];
```
### Methods
```
public MesoInherit(MesoStation mesoStation)
```
  The constructor for MesoInherit, passes in mesoStation and assigns it to mesoStation.
```
int[] calAverage() 
```
  Calculates the ASCII ceiling, floor, and average and places each one into an array. returns the array.
```  
public char letterAverage()
```
  Takes the average at index two of stationArray and converts into a char. returns char letterAverage

# MesoStation Class
public class MesoStation 
### Imports and Variables
```
private String stID;
```
### Methods
```
public MesoStation(String stId)
```
  The constructor for MesoStation. Assigns stId to stId.
```
public String getStID() 
```
  returns stId

# PosAvg Class
public class PosAvg
### Imports and Variables
```
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
  
public String stId;
private int numStations = 0;
private int capacity = 2;
private String[] nameArray = null;
private int stIdIndex = 0;
```
### Methods
```
public String[] getNameArray() 
```
  returns nameArray
```
public void setNameArray(String[] nameArray)
```
  sets nameArray to nameArray
```  
public PosAvg(String stId)
```
  Constructor for PosAvg. Creates new MesoStation object meso and passes in stId. Assigns stId to meso.getstId(). Has error exception, fileNotFoundException.
```
public int indexOfStation()
```
  returns stIdIndex
```
private void loadData() throws FileNotFoundException, IOException 
```
  Loads the lines of data from Mesonet.txt and assigns them to String object.
```
private void expandArray()
```
  Expands the array if nameArray runs out of space.
```
public void addElement(String name)
```
  Checks if nameArray is full. If full calls expandArray, then adds an element to nameArray
```
public String toString()
```
  returns the toString of PosAvg
 

